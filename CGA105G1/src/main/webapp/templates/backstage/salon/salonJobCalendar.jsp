<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>IPET 寵物 | 美容專區 | 班表管理</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome Icons -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/backstage/plugins/fontawesome-free/css/all.css">
  <!-- fullCalendar -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/backstage/plugins/fullcalendar/main.css">
  <!-- iCheck for checkboxes and radio inputs -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/backstage/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/backstage/css/adminlte.css">

  <!--  美容員工 event style-->
  <style>
    .event-head{
      border-radius: 5px;
      position: relative;
    }
    .event-head:hover{
      background-color: rgba(183, 206, 231, 0.51);
    }
    .event-img{
      background: rgba(12, 132, 255, 0.37);
      width: 40px;
      margin-right: 15px;
      margin-top: 4px ;
      margin-bottom: 4px ;
      margin-left: 4px;
    }

    .event-circle {
      border: 1px solid gainsboro;
      display: inline-block;
      position: relative;
      margin-left: 10px;
      /*background: #f56954;*/
      width: 15px;
      height: 15px;
      border-radius: 50%;
    }

    .event-body{
        padding: 10px;
    }


  </style>
</head>
<body class="hold-transition sidebar-mini">

<div class="wrapper">
  <!--  Navbar -->
  <%@ include file="/templates/backstage/common/navbar.jsp" %>
  <!-- /.navbar -->

  <!-- 左邊選單區 Main Sidebar Container -->
  <%@ include file="/templates/backstage/common/sidebar.jsp" %>
  <!-- /.aside -->

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>美容員工班表</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/templates/backstage/back-index.jsp">Home</a></li>
              <li class="breadcrumb-item">班表管理</li>
              <li class="breadcrumb-item active"><a href="${pageContext.request.contextPath}/templates/backstage/salon/salon_schedule.jsp">班表瀏覽</a></li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-md-3">
            <div class="sticky-top mb-3">
              <div class="card">
                <div class="card-header">
                  <h4 class="card-title">美容員工</h4>
                </div>
                <div class="card-body">
                  <button type="button" id="btn-event-clean" class="btn btn-block btn-default btn-sm" onclick="">清除</button>
                  <button type="button" id="btn-event-chooseall" class="btn btn-block btn-default btn-sm" onclick="">全選</button>
                  <p></p>
                  <div id="external-events" class="accordion">
                   <%--  Groomer --%>
                    <c:forEach var="i" begin="0" end="${groomerIds.size() - 1}">
                      <!--員工 -->
                      <div class="event-item">
                        <h6 class="event-head">
                          <img src= "${pageContext.request.contextPath}/static/backstage/img/dog1.png" alt="em_img" class="img-circle elevation-2 event-img"/>
                            ${groomNames[i]}
                        </h6>
                        <!-- 員工上班時段 -->
                        <div class="event-body">
                          <div class="icheck-primary d-inline">
                            <input type="checkbox" id="${groomerIds[i]}_上午" value="${groomerIds[i]}_上午" class="filter-event" checked>
                            <label for="${groomerIds[i]}_上午">
                              (上午) ${groomNames[i]}
                            </label>
                          </div>
                          <p></p>
                          <div class="icheck-primary d-inline">
                            <input type="checkbox" id="${groomerIds[i]}_下午" value="${groomerIds[i]}_下午" class="filter-event" checked>
                            <label for="${groomerIds[i]}_下午">
                              (下午) ${groomNames[i]}
                            </label>
                          </div>
                          <p></p>
                          <div class="icheck-primary d-inline">
                            <input type="checkbox" id="${groomerIds[i]}_晚上" value="${groomerIds[i]}_晚上" class="filter-event" checked>
                            <label for="${groomerIds[i]}_晚上">
                              (晚上) ${groomNames[i]}
                            </label>
                          </div>
                        </div>
                        <p></p>
                        <!-- /員工上班時段 -->
                      </div>
                      <!-- /.員工 -->
                    </c:forEach>

                     <%--  Asst --%>
                     <c:forEach var="i" begin="0" end="${asstIds.size() - 1}">
                       <!--員工 -->
                       <div class="event-item">
                         <h6 class="event-head">
                           <img src= "${pageContext.request.contextPath}/static/backstage/img/dog2.png" alt="em_img" class="img-circle elevation-2 event-img"/>
                             ${asstNames[i]}
                         </h6>
                         <!-- 員工上班時段 -->
                         <div class="event-body">
                           <div class="icheck-primary d-inline">
                             <input type="checkbox" id="${asstIds[i]}_上午" value="${asstIds[i]}_上午" class="filter-event" checked>
                             <label for="${asstIds[i]}_上午">
                               (上午) ${asstNames[i]}
                             </label>
                           </div>
                           <p></p>
                           <div class="icheck-primary d-inline">
                             <input type="checkbox" id="${asstIds[i]}_下午" value="${asstIds[i]}_下午" class="filter-event" checked>
                             <label for="${asstIds[i]}_下午">
                               (下午) ${asstNames[i]}
                             </label>
                           </div>
                           <p></p>
                           <div class="icheck-primary d-inline">
                             <input type="checkbox" id="${asstIds[i]}_晚上" value="${asstIds[i]}_晚上" class="filter-event" checked>
                             <label for="${asstIds[i]}_晚上">
                               (晚上) ${asstNames[i]}
                             </label>
                           </div>
                         </div>
                         <p></p>
                         <!-- /員工上班時段 -->
                       </div>
                       <!-- /.員工 -->
                     </c:forEach>
                  </div>
                </div>
                <!-- /.card-body -->
              </div>
              <!-- /.card -->
            </div>
          </div>
          <!-- /.col -->
          <div class="col-md-9">
            <div class="card card-primary">
              <div class="card-body p-0">
                <!-- THE CALENDAR -->
                <div id="calendar"></div>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
          <!-- /.col -->
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
  <%@ include file="/templates/backstage/common/footer.jsp" %>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/static/backstage/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="${pageContext.request.contextPath}/static/backstage/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- jQuery UI -->
<script src="${pageContext.request.contextPath}/static/backstage/plugins/jquery-ui/jquery-ui.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/static/backstage/js/adminlte.min.js"></script>
<!-- fullCalendar 2.2.5 -->
<script src="${pageContext.request.contextPath}/static/backstage/plugins/moment/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/static/backstage/plugins/fullcalendar/main.js"></script>


<!-- sidebar menu Class -->
<script>
  $("p:contains(班表管理)").closest("li").addClass("menu-open");
  $("p:contains(班表瀏覽)").closest("a").addClass("active");
</script>
<!-- Page specific script -->
<script>
  $(function () {
    let jobEvent = [];
    for (let job of ${allJobs}){
      let periodColorIndex = function (period){
        if (period === "上午") {
          return "#f56954";
        }else if (period === "下午"){
          return "#0073b7";
        }else if (period === "晚上"){
          return "#00a65a";
        }
      }
      jobEvent.push({
        title: "(" + job.schPeriod + ") " +  job.groomerName + "; " + job.asstID1Name + "; " + job.asstID2Name,
        employee: [job.groomerName, job.asstID1Name, job.asstID2Name],
        allDay: true,
        start: job.schDate,
        borderColor: periodColorIndex(job.schPeriod),
        backgroundColor: periodColorIndex(job.schPeriod),
        employee_period: [job.groomerID + "_" + job.schPeriod,
          job.asstID1 + "_" + job.schPeriod,
          job.asstID2 + "_" + job.schPeriod]
      })
    }

    $(".accordion > div").accordion({ collapsible: true, heightStyle: "content", active: false });


    /* initialize the external events
     -----------------------------------------------------------------*/
    function ini_events(ele) {
      ele.each(function () {

        // create an Event Object (https://fullcalendar.io/docs/event-object)
        // it doesn't need to have a start or end
        var eventObject = {
          title: $.trim($(this).text()) // use the element's text as the event title
        }

        // store the Event Object in the DOM element so we can get to it later
        $(this).data('eventObject', eventObject)

        // make the event draggable using jQuery UI
        $(this).draggable({
          zIndex        : 1070,
          revert        : true, // will cause the event to go back to its
          revertDuration: 0  //  original position after the drag
        })

      })
    }

    ini_events($('#external-events div.external-event'))

    /* initialize the calendar
     -----------------------------------------------------------------*/
    //Date for the calendar events (dummy data)
    var date = new Date()
    var d    = date.getDate(),
            m    = date.getMonth(),
            y    = date.getFullYear()

    var Calendar = FullCalendar.Calendar;
    var calendarEl = document.getElementById('calendar');

    // initialize the external events
    // -----------------------------------------------------------------

    let calendar = new Calendar(calendarEl, {
      handleWindowResize:true,

      headerToolbar: {
        left  : 'prev,next',
        center: 'title',
        right: 'dayGridMonth,listMonth'
      },
      allDaySlot: false,

      themeSystem: 'bootstrap',

      /*
      eventReceive : function(info) {
        alert(info.event.title);
      },
      **/

      /*
      eventDrop : function(info) {
        alert(info.event.title + " was dropped on "
                + info.event.start.toISOString());

        if (!confirm("Are you sure about this change?")) {
          info.revert();
        }
      },
      **/

      /*
      eventClick : function(info) {
        //delete event from calender
        if (confirm("Are you sure you want to remove this?")){
          info.event.remove();
        }
      }
      * */


      //Random default events
      // why filter is not working?: https://stackoverflow.com/questions/64198394/fullcalendar-v5-how-to-show-and-hide-events-with-checkbox
      events: function (fetchInfo, successCallback, failureCallback) {
        successCallback(jobEvent)
      },
      editable  : false,
      droppable : false, // this allows things to be dropped onto the calendar !!!
      /*
        drop: function(info) {
        // is the "remove after drop" checkbox checked?
        if (checkbox.checked) {
          // if so, remove the element from the "Draggable Events" list
          info.draggedEl.parentNode.removeChild(info.draggedEl);
        }
      }
      * */


      eventDidMount: function(arg) {
        // arg: 事件，這裡會自動採用迴圈，一次進來一個事件, ex: 2_上午,6_上午,7_上午
        // val: checked box，此為 array
        // filter the event by multiple checkbox
        arg.el.style.display = "none"
        let oneEvent = arg.event.extendedProps.employee_period.toString().split(",");
        let val = $('.filter-event:checked').map(function () {
          return this.value;
        }).get();

        for (let i = 0; i < oneEvent.length; i++){
           if (val.includes(oneEvent[i])){
             arg.el.style.display = "";
             continue;
           }
        }
      }

    });

    calendar.render();
    // $('#calendar').fullCalendar()


    // Refresh the calendar after filter
    $('input[class=filter-event]').change(function (){
      calendar.refetchEvents();
    })

    // choose all employees
    $('#btn-event-chooseall').click(function (){
      $('input[class=filter-event]').prop("checked",true);
      calendar.refetchEvents();
    })

    // clean all employees
    $('#btn-event-clean').click(function (){
      $('input[class=filter-event]').prop("checked",false);
      calendar.refetchEvents();
    })

    // when we click 'pushmenu', fullcalender need to be resize
    // 300 msecs are the default seconds
    $('a[data-widget=pushmenu]').click(function(){
      setTimeout( function(){
        calendar.refetchEvents();
      }  , 300 );
    })
  })
</script>
</body>
</html>
