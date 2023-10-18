function reverseWordsInSentence() {
            
            var sentence = prompt("Enter a sentence:");

            if (sentence === null || sentence === "") {
                alert("You didn't enter a sentence. Please try again.");
                return;
            }
            var words = sentence.split(' ');
            var reversedWords = words.map(word => {
                return word.split('').reverse().join('');
            });

            
            var reversedSentence = reversedWords.join(' ');
            alert("Reversed sentence: " + reversedSentence);
        }

        reverseWordsInSentence();
