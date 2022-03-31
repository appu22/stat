//strike throw functionality
$("ul").on("click", "li", function () {

    $(this).toggleClass("done")

    //****using jquery  */
    // console.log($(this).css("color"));
    // if ($(this).css("color") != "rgb(0, 128, 0)") {

    //     $(this).css({
    //         color: "green",
    //         textDecoration: "line-through"
    //     });
    // } else {

    //     $(this).css({
    //         color: "black",
    //         textDecoration: "none"
    //     });

    // }
});


//deleting

$("ul").on("click", "span", function (event) {

    $(this).parent().fadeOut(200, function () {
        $(this).remove();
    });
    event.stopPropagation();
});

$("input").keypress(function (event) {

    if (event.which === 13) { //13 ascii code 

        var task = $("input").val();

        $("ul").append(' <li><span class="delete"><i class="fas fa-trash-alt"></i> </span> ' + task + '</li>');

        $("input").val("");

    } else {

    }

});

//toggling input form
$("#pulse").click(function () {
    $("input").fadeToggle();
});