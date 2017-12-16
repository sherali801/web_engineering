document.querySelector("#countWords").disabled = true;
document.querySelector("#subString").disabled = true;
document.querySelector("#inputString").addEventListener("input", inputStringVerification);
document.querySelector("#inputSubString").addEventListener("input", inputSubStringVerification);
document.querySelector("#countWords").addEventListener("click", countSpaceSeparatedWords);
document.querySelector("#subString").addEventListener("click", searchWord);

function inputStringVerification() {
    document.querySelector("#countWords").disabled = (document.querySelector("#inputString").value.trim() != "") ? false : true;
}

function inputSubStringVerification() {
    document.querySelector("#subString").disabled = (document.querySelector("#inputSubString").value.trim() != "") ? false : true;
}

function countSpaceSeparatedWords() {
    var arrayOfSpaceSeparatedWords = document.querySelector("#inputString").value.trim().split(" ");
    document.querySelector("#result").value = arrayOfSpaceSeparatedWords.length;
    var concatinatedStringOfWords = "";
    for (i = 0; i < arrayOfSpaceSeparatedWords.length; i++) {
        concatinatedStringOfWords += arrayOfSpaceSeparatedWords[i] + "\n";
    }
    alert(concatinatedStringOfWords);
}

function searchWord() {
    alert((document.querySelector("#inputString").value.search(document.querySelector("#inputSubString").value)) != -1 ? "Found" : "Not Found");
}
