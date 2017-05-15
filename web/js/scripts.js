/**
 * Created by Juilee on 4/13/2017.
 */
var current_page = 1;
var records_per_page = 1;

var elements = document.getElementById("recs").getElementsByClassName("test");
/*var e = [];
for(var i=0 ; i<=elements.length;i++){
    e[i] = elements[i];
}*/

var e0 = elements[0];
var e1 = elements[1];
var e2 = elements[2];
var e3 = elements[3];
var e4 = elements[4];


function prevPage()
{
        var recs = document.getElementById("recs");
        current_page--;
        if (current_page == 1) {
            recs.innerHTML = e0.outerHTML;
        }
        if (current_page == 2) {
            recs.innerHTML = e1.outerHTML;
        }
        if (current_page == 3) {
            recs.innerHTML = e2.outerHTML;
        }
        if (current_page == 4) {
            recs.innerHTML = e3.outerHTML;
        }
        if (current_page == 5) {
            recs.innerHTML = e4.outerHTML;

    }
}
function nextPage()
{
  /*  current_page++;
    var test = current_page;
    var recs = document.getElementById("recs");
    recs.innerHTML = e[test--].outerHTML;

    debugger;*/
  if(current_page<=5) {
      var recs = document.getElementById("recs");
      current_page++;
      if (current_page == 1) {
          recs.innerHTML = e0.outerHTML;
      }
      if (current_page == 2) {
          recs.innerHTML = e1.outerHTML;
      }
      if (current_page == 3) {
          recs.innerHTML = e2.outerHTML;
      }
      if (current_page == 4) {
          recs.innerHTML = e3.outerHTML;
      }
      if (current_page == 5) {
          recs.innerHTML = e4.outerHTML;
      }
  }
  /*  if (current_page <= e.length) {
        current_page++;
        changePage(current_page);
    }*/
}
function changePage(page)
{
    var btn_next = document.getElementById("btn_next");
    var btn_prev = document.getElementById("btn_prev");
    var recs = document.getElementById("recs");
/*    var page_span = document.getElementById("page");*/

    // Validate page
    if (page < 1) page = 1;
    if (page > numPages()) page = numPages();

    /*recs.innerHTML = "";*/
    for (var i = (page-1) * records_per_page; i < (page * records_per_page) && i < elements.length; i++) {

        recs.innerHTML = elements[i].outerHTML;
    }

 /*   if (page == 1) {
        btn_prev.style.visibility = "hidden";
    } else {
        btn_prev.style.visibility = "visible";
    }

    if (page == numPages()) {
        btn_next.style.visibility = "hidden";
    } else {
        btn_next.style.visibility = "visible";
    }*/
}

function numPages()
{
    return Math.ceil(elements.length / records_per_page);
}

window.onload = function() {
    changePage(1);
};