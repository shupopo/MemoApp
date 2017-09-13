function postComment(text) {
    $.ajax({
        headers: { 
            'Accept': 'application/json',
            'Content-Type': 'application/json' 
        },
        type: 'POST',
        dataType: 'json',
        url: '/memos',
        data: JSON.stringify({
            text: text,
        })
    })
    .done(function(res) {
        $('ul').append($(`<li>${res.text}</li>`));
    })
    .fail(function(error) {
        console.log(error);
    });
}