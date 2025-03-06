// 문제 01: 0~60까지 숫자 중 3의 배수만 출력하기
let i = 0;
while(i<61){
    if(i%3===0)
        console.log(i);
    i++;
}

let x = 0;
do{
    x+=3;
    if(x%3===0)
        console.log(x);
} while (x<60)

// 문제 02: 윤년 계산
let year = 2000;
while (year < 2031){
    if(year % 400 === 0)
        console.log(`${year}는 윤년입니다.`)
    else if((year % 4 ===0) &&(year % 100 !== 0))
        console.log(`${year}는 윤년입니다.`)
    year++;
}

let arr = ['banana', 'apple', 'orange'];
for(let a = 0; a < arr.length; a++) {
    console.log(arr[a]);
}
for(let b in arr){
    console.log(b + ":" + arr[b]);
}
for (let i = 0; i < 10; i++){
    console.log(i);
    if (i === 5)
        break;
}
for (let i = 0; i < 10; i++){
    if (i % 2 === 0)
        continue;
    console.log(i);
}

function nineNineDan(dan){
    for (let num = 0; num <= 9; num++){
        console.log(`${dan} * ${num}은(는) ${dan * num}입니다. `)
    }
}
for (let seq = 1; seq < 10; seq++)
    nineNineDan(seq);

three = function() {
    for (let i = 1; i <= 9; i++) {
        console.log('3 * ' + i + ' = ' + (3 * i));
    }
};
three();

gugudan = () => {
    for (let i = 1; i <= 9; i++) {
        console.log('3 * ' + i + ' = ' + (3 * i));
    }
};
gugudan();

function sum(num1, num2) {
  return num1 + num2;
}
result = sum(110, 20);
console.log(result);

(function nineNine(dan){
    for (let num = 0; num <= 9; num++){
        console.log(`${dan} * ${num}은(는) ${dan * num}입니다. `)
    }
})(7);
