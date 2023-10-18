function sortArrayDescending() {
            var input = prompt("Enter an array of numbers (comma-separated):");
            
            if (input === null || input === "") {
                alert("You didn't enter an array. Please try again.");
                return;
            }
            
            var numbers = input.split(',').map(Number);
            numbers.sort(function(a, b) {
                return b - a;
            });

            alert("Sorted in descending order: " + numbers);
        }
        sortArrayDescending();