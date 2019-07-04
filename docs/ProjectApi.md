# ProjectApi

All URIs are relative to *http://127.0.0.1:8082/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProjectById**](ProjectApi.md#getProjectById) | **GET** /projects/{projectId} | 
[**getProjects**](ProjectApi.md#getProjects) | **GET** /projects | 
[**getProjectsByStatus**](ProjectApi.md#getProjectsByStatus) | **GET** /projects/status/{status} | 

<a name="getProjectById"></a>
# **getProjectById**
> Project getProjectById(projectId)



### Example
```java
// Import classes:
//import com.redhat.homework.projectservice.client.invoker.ApiException;
//import com.redhat.homework.projectservice.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Integer projectId = 56; // Integer | 
try {
    Project result = apiInstance.getProjectById(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjectById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **Integer**|  |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProjects"></a>
# **getProjects**
> List&lt;Project&gt; getProjects()



### Example
```java
// Import classes:
//import com.redhat.homework.projectservice.client.invoker.ApiException;
//import com.redhat.homework.projectservice.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
try {
    List<Project> result = apiInstance.getProjects();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjects");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProjectsByStatus"></a>
# **getProjectsByStatus**
> List&lt;Project&gt; getProjectsByStatus(status)



### Example
```java
// Import classes:
//import com.redhat.homework.projectservice.client.invoker.ApiException;
//import com.redhat.homework.projectservice.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String status = "status_example"; // String | 
try {
    List<Project> result = apiInstance.getProjectsByStatus(status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#getProjectsByStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **String**|  |

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

