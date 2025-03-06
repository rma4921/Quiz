let dayOfTheWeek = "Friday"
switch(dayOfTheWeek) {
    case "Monday" :
        console.log("Start of the work week");
        break;
    case "Friday" :
        console.log("Almost weekend");
        break;
    default :
        console.log("Midweek");
        break;
}

let temperature = 17;
if (temperature >= 30) {
    console.log("정말 더운 날씨입니다.");
} else if (temperature >= 25) {
    console.log("더운 날씨입니다.");
} else if (temperature >= 15) {
    console.log("서늘한 날씨입니다.");
} else if (temperature >= 0) {
    console.log("시원한 날씨입니다.");
} else {
    console.log("정말 추운 날씨입니다.");
}
