$(document).ready(function(){
    console.log("Library loaded")
    $.get("http://localhost:9000/people",function(data){
        console.log(data)
        let code=""
        for(let x of data){
            code+="<tr>"
            code+="<td>"+x.sno+"</td>"
            code+="<td>"+x.name+"</td>"
            code+="<td>"+x.city+"</td>"
            code+="</tr>"
        }
        $("#tdata").html(code)
    })
})