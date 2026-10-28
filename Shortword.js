function findAll(sentence) {
  if (typeof sentence !== "string" || sentence.trim() === "") {
    throw new Error("Sentence must not be null, empty or blank");
  }
  const words = sentence.trim().split(" ");
  let shortestLength = words[0].length;
  for (let i = 0; i < words.length; i++) {
    if (words[i].length > 0 && words[i].length < shortestLength) {
      shortestLength = words[i].length;
    }
  }

  const result = [];
  for (let i = 0; i < words.length; i++) {
    if (words[i].length === shortestLength) {
      result.push(words[i]);
    }
  }
  return result;
}
function main() {
  console.log(findAll("I love coding"));
  console.log(findAll("cat dog bird"));
  console.log(findAll("I    love     Java"));
if (require.main === module) {
  main();
}

module.exports = { findAll };
