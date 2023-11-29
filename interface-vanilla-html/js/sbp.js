document.addEventListener('DOMContentLoaded', function() {
  // Fetch data from the API endpoint
  fetch('http://localhost:8081/vendas/produto')
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

      // Extracting product names and total quantity sold from the fetched data
      const produtos = data.map(item => item.produto);
      // produtos = ["lança-teias", "laço da verdade", "sabre de luz", ...]
      const totalQuantidadeVendida = data.map(item => item.quantidadeVendida);
      // totalQuantidadeVendida = [29, 18, 67, 115]
      const totalValorVendido = data.map(item => ((item.quantidadeVendida * item.precoUnitario)/5));
      // totalValorVendido = [29, 18, 67, 115]

      // Chart.js setup for sales by product
      const ctx = document.getElementById('salesByProductChart').getContext('2d');
      new Chart(ctx, {
        type: 'bar',
        data: {
          labels: produtos,
          datasets: [{
            label: 'Vendas por produto',
            data: totalQuantidadeVendida,
            backgroundColor: 'rgba(255, 99, 132, 0.2)',
            borderColor: 'rgba(255, 99, 132, 1)',
            borderWidth: 1
          },{
            label: 'Valores por produto',
            data: totalValorVendido,
            backgroundColor: 'rgba(255, 199, 132, 0.2)',
            borderColor: 'rgba(255, 199, 132, 1)',
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
                text: 'Total Vendido'
              }
            },
            x: {
              title: {
                display: true,
                text: 'Produtos'
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