# project-api-client

ProjectAPI
- API version: 1.0.0
  - Build date: 2019-07-03T21:16:25.420-05:00[America/Lima]

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.redhat</groupId>
  <artifactId>project-api-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.redhat:project-api-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/project-api-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.redhat.homework.projectservice.client.invoker.*;
import com.redhat.homework.projectservice.client.invoker.auth.*;
import com.redhat.homework.projectservice.client.model.*;
import com.redhat.homework.projectservice.client.api.ProjectApi;

import java.io.File;
import java.util.*;

public class ProjectApiExample {

    public static void main(String[] args) {
        
        ProjectApi apiInstance = new ProjectApi();
        try {
            List<Project> result = apiInstance.getProjects();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#getProjects");
            e.printStackTrace();
        }
    }
}
import com.redhat.homework.projectservice.client.invoker.*;
import com.redhat.homework.projectservice.client.invoker.auth.*;
import com.redhat.homework.projectservice.client.model.*;
import com.redhat.homework.projectservice.client.api.ProjectApi;

import java.io.File;
import java.util.*;

public class ProjectApiExample {

    public static void main(String[] args) {
        
        ProjectApi apiInstance = new ProjectApi();
        Integer projectId = 56; // Integer | 
        try {
            Project result = apiInstance.projectsProjectIdGet(projectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#projectsProjectIdGet");
            e.printStackTrace();
        }
    }
}
import com.redhat.homework.projectservice.client.invoker.*;
import com.redhat.homework.projectservice.client.invoker.auth.*;
import com.redhat.homework.projectservice.client.model.*;
import com.redhat.homework.projectservice.client.api.ProjectApi;

import java.io.File;
import java.util.*;

public class ProjectApiExample {

    public static void main(String[] args) {
        
        ProjectApi apiInstance = new ProjectApi();
        String status = "status_example"; // String | 
        try {
            List<Project> result = apiInstance.projectsStatusStatusGet(status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#projectsStatusStatusGet");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://127.0.0.1:8082/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProjectApi* | [**getProjects**](docs/ProjectApi.md#getProjects) | **GET** /projects | 
*ProjectApi* | [**projectsProjectIdGet**](docs/ProjectApi.md#projectsProjectIdGet) | **GET** /projects/{projectId} | 
*ProjectApi* | [**projectsStatusStatusGet**](docs/ProjectApi.md#projectsStatusStatusGet) | **GET** /projects/status/{status} | 

## Documentation for Models

 - [Project](docs/Project.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


