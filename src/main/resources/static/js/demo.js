function post(){
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();
    
    if (!content){
        alert("回复的内容不能为空哦！");
        return;
    }
    
    $.ajax({
        type: "POST",
        url: "/comment",
        contentType:'application/json',
        data: JSON.stringify({
            "parentId": questionId,
            "content": content,
            "type": 1
        }),
        success: function (response) {
            if (response.code == 200){
                window.location.reload();
            }else{
                alert(response.message);
            }
            console.log(response);
        },
        dataType: "json"
    });
}