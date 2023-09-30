# Project Name
University Event Management

# Frameworks and Language Used
**Spring Boot** 3.1.4
**Java** 17
**Maven** 3.8.1

# Data Flow


_**Controller:**_ The controller has endpoints for adding a student or event, getting all student or event, getting a student or event by their ID, and deleting a student or event by their ID. The @PostMapping annotation is used for the addstudent or addevent endpoint to handle HTTP POST requests with a JSON request body containing a student or event object. The @Valid annotation is used to validate the student object against any defined validation constraints.

The @GetMapping annotation is used for the (getallstudent and getstudentbyid) or (getallevent and getalleventbydate) endpoints to handle HTTP GET requests with and without a path variable for the student ID or event ID, respectively. The @PathVariable annotation is used to extract the student ID or event ID from the request URL and pass it to the getstudentbyid or geteventbyid method.

The @PutMapping annotation is used for the updatestudentdepartment or updateevent endpoint to handle HTTP PUT request with ID and Department as path variable for student and event object as request body for event, respectively. 

The @DeleteMapping annotation is used for the deletestudentbuid or deleteeventbyid endpoint to handle HTTP DELETE requests with a path variable for the student ID or event ID.

The controller class also has an autowired instance of the StudentService and EventService interface to handle business logic for the University Event Management.

This implementation demonstrates a basic setup for a REST API controller in Spring Boot, but it can be expanded upon and customized based on specific requirements for the User Management System.


_**Services**:_ The services layer contains the business logic of the application. It receives requests from the controller, performs necessary computations or data manipulations, and interacts with the repository layer to access data.

_**Repository:**_ The repository layer is responsible for interacting with the database. It uses Spring Data JPA to perform CRUD (create, read, update, delete) operations on entities.
