/*
 * ProjectAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.homework.projectservice.client.api;

import com.redhat.homework.projectservice.client.invoker.ApiException;
import com.redhat.homework.projectservice.client.model.Project;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectApi
 */
@Ignore
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsTest() throws ApiException {
        List<Project> response = api.getProjects();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsProjectIdGetTest() throws ApiException {
        Integer projectId = null;
        Project response = api.projectsProjectIdGet(projectId);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsStatusStatusGetTest() throws ApiException {
        String status = null;
        List<Project> response = api.projectsStatusStatusGet(status);

        // TODO: test validations
    }
}