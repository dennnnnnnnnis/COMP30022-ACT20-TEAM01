document.addEventListener('DOMContentLoaded', function() {

  const form = document.getElementById('request-form');

    form.addEventListener('submit', function(event) {

      event.preventDefault();

      const description = document.getElementById('description').value;

      fetch('/api/saveRequest', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
          'Authorization': 'Bearer ' + localStorage.getItem('jwt')
        },
        body: JSON.stringify({ description: description })
      })
      .then(response => response.json())
      .then(data => {
        console.log(data);
        if (data.message === 'Request saved successfully!') {
            alert('Request saved successfully!');
          }
      })
      .catch((error) => {
        console.error('Error:', error);
      });
    });
  }
);