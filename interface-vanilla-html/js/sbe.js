document.addEventListener('DOMContentLoaded', function() {
  // Fetch data from the API endpoint
  fetch('http://localhost:8081/performance/')
    .then(response => {
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      return response.json();
    })
    .then(dataArray => {
      if (!Array.isArray(dataArray) || dataArray.length === 0) {
        throw new Error('Invalid data format or empty response');
      }

      // Extracting employee names and total sales from the fetched data
      const employees = dataArray.map(item => item.funcionarioNome);
      const totalSales = dataArray.map(item => item.totalVendas);

      // Chart.js setup for employee performance comparison
      const ctx = document.getElementById('employeePerformanceChart').getContext('2d');
      new Chart(ctx, {
        type: 'pie',
        data: {
          labels: employees,
          datasets: [{
            label: 'Custo por Escritório',
            data: totalSales,
            backgroundColor: ["#0074D9", "#FF4136", "#2ECC40", "#FF851B", "#7FDBFF", "#B10DC9", "#FFDC00", "#001f3f", "#39CCCC", "#01FF70", "#85144b", "#F012BE", "#3D9970", "#111111", "#AAAAAA"],
            borderWidth: 1
          }]
        },
        
        options: {
          indexAxis: 'y',
          legend: {
            position: 'bottom',
          },
          scales: {
            x: {
              beginAtZero: true,
              title: {
                display: true,
                text: 'Vendas Totais'
              }
            },
            y: {
              title: {
                display: true,
                text: 'Funcionários'
              }
            }
          }
        }
      });
    })
    .catch(error => {
      console.error('Error fetching or processing data:', error);
    });
});