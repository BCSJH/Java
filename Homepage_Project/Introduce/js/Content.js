function changes(name){
    var Info_Header = parent.document.getElementById("Info_Header");
    var Info_SideInfo = parent.document.getElementById("Info_SideInfo");
    var Info_Content = parent.document.getElementById("Info_Content");

    Info_SideInfo.style.display = "none"; // sns 박스 값들 없애기
    Info_Content.style.height = "350px"; // 사이즈 크게 하기

    main_color(); // 메뉴 색깔 변화
    
    one_color(name);// 선택한 값 하얗게 만들기
    // display_block();
    // display_none(name);
}

// 이전에 색깔이 변화된 아이들은 원래 색깔로 해당 a 태그 값들 조정
function main_color(){
    var menus = document.getElementsByTagName('a'); 
    for(var i = 0; i < menus.length; i++){
        var menu_one = menus.item(i);
        menu_one.style.color = "black";
        menu_one.style.opacity = "0.5";
    }
}

//선택한 값 하얗게 만들고 나머지 메뉴는 투명하게 만들기
function one_color(name){
    var menu = document.getElementById(name);
    menu.style.color = "white";
    menu.style.opacity = "1";
}

function display_none(name){
    var p_tage = document.getElementsByClassName('Content');
    var name_str = name.split('_')[1]; // 클릭한 값의 아이디 받아오기
    for(var i = 0; i < p_tage.length; i++){
        var p_tage_one = p_tage.item(i);
        // console.log(p_tage_one);
        if(p_tage_one.id == name_str){
            console.log("비교 잘 됨");
        }else{
            console.log("지워야됨");
            p_tage_one.style.display = "hidden";
        }
    }

}
