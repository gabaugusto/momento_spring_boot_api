document.addEventListener('DOMContentLoaded', function() {
  // Fetch data from the API endpoint
  fetch('http://localhost:8081/relatorio_escritorio/escritorios')
    .then(response => {
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      return response.json();
    })
    .then(data => {
      if (!Array.isArray(data)) {
        throw new Error('Invalid data format');
      }

      // Extracting office's  names and total costs from the fetched data
      const offices = data.map(item => item.escritorioNome);
      const costs = data.map(item => item.custo);

      // Chart.js setup for costs by office
      const ctx = document.getElementById('officesCosts').getContext('2d');
      new Chart(ctx, {
        type: 'bar',
        data: {
          labels: offices,
          datasets: [{
            label: 'Custos',
            data: costs,
            backgroundColor: 'rgba(255, 99, 132, 0.2)',
            borderColor: 'rgba(255, 99, 132, 1)',
            borderWidth: 1
          }]
        },
        options: {
          indexAxis: 'y',
          scales: {
            y: {
              beginAtZero: true,
              title: {
                display: true,
                text: 'Escritorios'
              }
            },
            x: {
              title: {
                display: true,
                text: 'Custo Total'
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