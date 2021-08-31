function changes(){
    var a = document.getElementById("Myself");
    // a.style.backgroundColor = "black";
    var Info_Header = parent.document.getElementById("Info_Header");
    var Info_SideInfo = parent.document.getElementById("Info_SideInfo");
    var Info_Content = parent.document.getElementById("Info_Content");

    Info_SideInfo.style.display = "none"; // sns 박스 값들 없애기
    Info_Content.style.height = "450px";
}

function contents(){
    var a = parent.document.getElementById("Info_Content")
}
