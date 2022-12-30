# Students list
This is a maven build RESTful CRUD API using Spring Boot, MySQL, JPA, and Hibernate. It allows you to perform basic create, update, read and delete operations.

## Prerequisites

* Java 8 and above
* Maven 
* MySQL 

## Usage

Clone the repository 

```
git clone https://github.com/cornelisp/StudentsList
```

Go inside the cloned directory 

```
cd StudentsList
```

Run the Maven build 

```
mvn clean install
```

Run the application using 

```
mvn spring-boot:run
```

## Endpoints

### GET /students
Get a list of all the students.

### GET /students/{id}
Get details for a particular student.

### GET /students/{firstName}
Get details for a particular student by first name.

### POST /addStudent
Create a new student.

### POST /addStudents
Create a new list of students.


### PUT /update
Update an existing user.

### DELETE /delete/{id}
Delete an existing student.

## Built with 

* Maven
* Spring Boot
* MySQL
* JPA
* Hibernate

## Testing

The application was tested using Tomcat.
To test functionality please provide example text in the body between quotes. Note that semester is an integer.

```
{
    "firstName":"",
    "lastName":"",
    "faculty":"",
    "semester":
}
```
For updating include id in body.


Here is example of functionality:

![studentsList](https://user-images.githubusercontent.com/96597273/210104243-67032cff-8571-44fa-884d-f161d80e812f.jpg)



## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
