# project-api-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

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

    mvn package

Then manually install the following JARs:

* target/project-api-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.redhat.homework.projectservice.client.invoker.*;
import com.redhat.homework.projectservice.client.invoker.auth.*;
import com.redhat.homework.projectservice.client.invoker.model.*;
import com.redhat.homework.projectservice.client.api.ProjectApi;

import java.io.File;
import java.util.*;

public class ProjectApiExample {

    public static void main(String[] args) {
        
        ProjectApi apiInstance = new ProjectApi();
        Integer projectId = 56; // Integer | 
        try {
            Project result = apiInstance.getProjectById(projectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectApi#getProjectById");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://127.0.0.1:8082/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProjectApi* | [**getProjectById**](docs/ProjectApi.md#getProjectById) | **GET** /projects/{projectId} | 
*ProjectApi* | [**getProjects**](docs/ProjectApi.md#getProjects) | **GET** /projects | 
*ProjectApi* | [**getProjectsByStatus**](docs/ProjectApi.md#getProjectsByStatus) | **GET** /projects/status/{status} | 


## Documentation for Models

 - [Project](docs/Project.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



