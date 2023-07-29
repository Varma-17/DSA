const arr = [1, 2, 3, 4, 5];

const reversedArray = arr.reduce((reversed, currentValue) => {
  // dding the current element to the beginning of the reversed array
  return [currentValue, ...reversed];
}, []);

console.log(reversedArray); // Output: [5, 4, 3, 2, 1]
