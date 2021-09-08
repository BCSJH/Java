const user = function(id, password1, password2, name, phone, email){
    this.id = id;
    this.password1 = password1;
    this.password2 = password2;
    this.name = name;
    this.phone = phone; 
    this. email = email;
}

//비밀번호 일치 체크
const pwdck = (password1, password2) => {
    let pwd_msg =password2.id + '_msg';
    if((password1.value != password2.value)){
        document.getElementById(pwd_msg).innerHTML = "비밀번호가 일치하지 않습니다.";
    }
};



//입력 태그 체크
const info_check = (joinform) => {
    let check =  joinform.getElementsByTagName("input");
    let cnt = 0;
    for(let info = 0; info < 5; info++){
        cnt += join_info_check(check[info]);
    }
    return cnt;
}
//입력 공백 체크
const join_info_check = (info) => {
    let infomsg =info.id + '_msg';
    if(info.value == ""){
        document.getElementById(infomsg).innerHTML = "필수 정보입니다.";
        return 1;
    }
    else{
        document.getElementById(infomsg).innerHTML = "";
        return 0;
    }
}



function join(){
    let joinform = document.joinForm;
    // console.log("도착");
    // console.log(joinform);
    // console.log(joinform.new_userId.value);

    console.log(joinform);

    pwdck(joinform.password1, joinform.password2); // 비밀번호 확인
    console.log(info_check(joinform));

    const a = new user(joinform.id.value, joinform.password1.value, joinform.password2.value, joinform.name.value, joinform.phone.value, joinform.email.value);

}