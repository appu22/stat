
// // array inside object
// var myCat = [{
//     "name": "meow",
//     "food": "milk"
// }];

// console.log(myCat[0].food);

// //object
// var myCat1 = {
//     "name": "meow",
//     "food": "milk"
// };
// console.log(myCat1.food);

var pageCounter = 1;

let animalData = document.getElementById("animal-info");
let btn = document.getElementById("btn");
btn.addEventListener("click", function () {
    var ourRequest = new XMLHttpRequest();
    ourRequest.open("GET", "https://learnwebcode.github.io/json-example/animals-" + pageCounter + ".json");
    ourRequest.onload = function () {
        let ourData = JSON.parse(ourRequest.responseText);
        // console.log(ourData[0]);
        renderHTML(ourData);
    };
    ourRequest.send();
    pageCounter++;
    console.log(pageCounter);
    if (pageCounter  == 4) {
        btn.classList.add("hide-me")
    }
});
function renderHTML(data) {

    let length = data.length;
    var text = "";
    for (let i = 0; i < length; i++) {
        text += data[i].name + " is a  " + data[i].species + ". \t ";
    }
    animalData.insertAdjacentText('beforeend', text);
}




