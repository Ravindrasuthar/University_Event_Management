# Project Name
University Event Management

# Frameworks and Language Used
**Spring Boot** 3.1.4
**Java** 17
**Maven** 3.8.1

# Data Flow


_**Controller:**_ The controller has endpoints for adding a student or event, getting all student or event, getting a student or event by their ID and getting all event by date, updating student department and update an event, and deleting a student or event by their ID. The @PostMapping annotation is used for the add/student or add/event endpoint to handle HTTP POST requests with a JSON request body containing a student or event object. The @Valid annotation is used to validate the student object against any defined validation constraints.

```
@RestController
public class EventController {

    @Autowired
    EventService eventService;
```
```
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
```

```
@PostMapping("add/event")
    public String AddEvent(@RequestBody EventModel eventModel)
    {
        return eventService.AddEvent(eventModel);
    }
```
```
@PostMapping("add/student")
    public String AddStudent(@RequestBody StudentModel s)
    {
        return studentService.AddStudent(s);
    }
```

The @GetMapping annotation is used for the (get/all/student and get/student/by/id/{id}) or (get/all/event and get/all/event/by/date/{date}) endpoints to handle HTTP GET requests with and without a path variable for the student ID or event ID, respectively. The @PathVariable annotation is used to extract the student ID or event ID from the request URL and pass it to the getstudentbyid or geteventbyid method.

```
@GetMapping("get/all/event")
    public List<EventModel> GetAllEvent()
    {
        return eventService.GetAllEvent();
    }

    @GetMapping("get/all/event/by/date/{d}")
    public List<EventModel> GetAllEventByDate(@PathVariable LocalDate d)
    {
        return eventService.GetAllEventByDate(d);
    }
```
```
@GetMapping("get/all/student")
    public List<StudentModel> GetAllStudent()
    {
        return studentService.GetAllStudent();
    }

    @GetMapping("get/student/by/id/{Id}")
    public StudentModel GetStudentById(@PathVariable Integer Id)
    {
        return studentService.GetStudentById(Id);
    }
```

The @PutMapping annotation is used for the updates/tudent/{Id}/{department} or update/event endpoint to handle HTTP PUT request with ID and Department as path variable for student and event object as request body for event, respectively. 

```
 @PutMapping("update/student/{Id}/{department}")
    public String UpdateStudentDepartment(@PathVariable Integer Id, @PathVariable Department department)
    {
        return studentService.UpdateStudentDepartment(Id,department);
    }
```
```
@PutMapping("update/event")
    public String UpdateEvent(@RequestBody EventModel eventModel)
    {
        return eventService.UpdateEvent(eventModel);
    }

```

The @DeleteMapping annotation is used for the deletestudentbuid or delete/event/by/id/{Id} endpoint to handle HTTP DELETE requests with a path variable for the student ID or event ID.
```
@DeleteMapping("delete/student/by/id/{Id}")
    public String DeleteStudent(@PathVariable Integer Id)
    {
        return studentService.DeleteStudent(Id);
    }
```
```
 @DeleteMapping("delete/event/by/id/{Id}")
    public String DeleteById(@PathVariable Integer Id)
    {
        return eventService.DeleteById(Id);
    }
```

The controller class also has an autowired instance of the StudentService and EventService interface to handle business logic for the University Event Management.

This implementation demonstrates a basic setup for a REST API controller in Spring Boot, but it can be expanded upon and customized based on specific requirements for the User Management System.

In the application.properties all the text required for connection with h2 database are written.
```
spring.datasource.url=jdbc:h2:mem:h2db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=123456
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect



spring.h2.console.enabled=true
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true
```


_**Services**:_ The services layer contains the business logic of the application. It receives requests from the controller, performs necessary computations or data manipulations, and interacts with the repository layer to access data.

_**Repository:**_ The repository layer is responsible for interacting with the database. It uses Spring Data JPA to perform CRUD (create, read, update, delete) operations on entities.

# Database Structure Used
I have used h2 as DataBase

# Project Summary
In this project i have create different endpoints like and used differet vaalidation for the end ponits

