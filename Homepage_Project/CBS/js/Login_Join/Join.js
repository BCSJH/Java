const user = function(userid, password1, password2, name, phone, email){
    this.userid = userid;
    this.password1 = password1;
    this.password2 = password2;
    this.name = name;
    this.phone = phone; 
    this. email = email;
}



//필수 입력값, 이메일 주소 체크
const info_join_success = (joinform) => {
    let span_red_check = joinform.getElementsByTagName("span");
    // console.log(span_red_check);
    for(let info = 0; info < 6; info++){
        if(span_red_check[info].innerHTML == ""){
            return 1;
        }
    }

    // (1) 성공시 값 txt 값 저장
    // (2) 페이지 이동
    console.log("성공");
    return 0;
}


//비밀번호 일치 체크
const pwdck = (password1, password2) => {
    let pwd_msg =password2.id + '_msg';
    if((password1.value != password2.value)){
        document.getElementById(pwd_msg).innerHTML = "비밀번호가 일치하지 않습니다.";
    }
};

//이메일 주소 체크
const email_check = (email) => {
    let a = email.id + "_msg";
    if((email.value).includes('@') && (email.value).includes('.')){
        document.getElementById(a).innerHTML = "";
    }
    else{
        document.getElementById(a).innerHTML = "이메일 주소를 다시 확인해주세요.";
    }
}

//입력 태그 체크
const info_space_check = (joinform) => {
    let check =  joinform.getElementsByTagName("input");
    let cnt = 0;
    for(let info = 0; info < 6; info++){
        join_info_check(check[info]);
    }
}


//입력 공백 체크
const join_info_check = (info) => {
    let idReg = /[a-zA-Z0-9]{4,19}/g;
    let phoneReg = /[0][1][(0-9)]{8,9}$/;
    let pwdReg = /^(?=.*?[A-Za-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,15}$/g;
    let infomsg = info.id + '_msg';

    let password1 = document.getElementById("password1");
    console.log(infomsg);
    console.log(info.id);
    if(info.value == ""){
        if(info.id !== "email"){
            document.getElementById(infomsg).innerHTML = "필수 정보입니다.";
        }else{ // email
            document.getElementById(infomsg).innerHTML = "";
        }
    }else{// 뭔가 입력이 되어있다면.
        if(info.id == "userid" && !idReg.test(info.value)){
            document.getElementById(infomsg).innerHTML = "5~20자의 영문, 숫자만 사용 가능합니다.";
        }else if(info.id == "password1" && !pwdReg.test(info.value)){
            document.getElementById(infomsg).innerHTML = "숫자/문자/특수문자가 포함된 8-15자리 이내의 암호로 구성되어야 합니다.";
        }else if(info.id == "password2" && password1.value != info.value){
            document.getElementById(infomsg).innerHTML = "비밀번호가 일치하지 않습니다.";
        }else if(info.id == "phone" && !phoneReg.test(info.value)){
            document.getElementById(infomsg).innerHTML = "전화번호를 확인해주세요.";
        }else if(info.id == "email"){
            if(!((email.value).includes('@') && (email.value).includes('.'))){
                document.getElementById(infomsg).innerHTML = "이메일 주소를 다시 확인해주세요.";
            }else{
                document.getElementById(infomsg).innerHTML = "";
            }
        }else if(info.id != "email"){
            document.getElementById(infomsg).innerHTML = "";
        }
    }
}



function join(joinform){
    console.log("도착");
    // console.log(joinform);
    // console.log(joinform.new_userId.value);
    console.log(joinform);

    // pwdck(joinform.password1, joinform.password2); // 비밀번호 확인
    info_space_check(joinform); // 입력 공백 체크
    // info_join_success(joinform);
    const a = new user(joinform.id.value, joinform.password1.value, joinform.password2.value, joinform.name.value, joinform.phone.value, joinform.email.value);
}