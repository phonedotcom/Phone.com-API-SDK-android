/**
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.CreateRouteParams;
import io.swagger.client.model.DeleteEntry;
import io.swagger.client.model.ListRoutes;
import io.swagger.client.model.RouteFull;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class RoutesApi {
  String basePath = "https://api.phone.com/v4";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Add a new route to the account.
  * Add a new route to the account. See Intro to Routes for more info on the properties.
   * @param accountId Account ID
   * @param data Route data
   * @return RouteFull
  */
  public RouteFull createRoute (Integer accountId, CreateRouteParams data) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = data;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling createRoute",
        new ApiException(400, "Missing the required parameter 'accountId' when calling createRoute"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/routes".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (RouteFull) ApiInvoker.deserialize(localVarResponse, "", RouteFull.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Add a new route to the account.
   * Add a new route to the account. See Intro to Routes for more info on the properties.
   * @param accountId Account ID   * @param data Route data
  */
  public void createRoute (Integer accountId, CreateRouteParams data, final Response.Listener<RouteFull> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = data;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling createRoute",
        new ApiException(400, "Missing the required parameter 'accountId' when calling createRoute"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/routes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((RouteFull) ApiInvoker.deserialize(localVarResponse,  "", RouteFull.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Delete a route from the account.
  * Delete a route from the account. See Intro to Routes for more info on the properties.
   * @param accountId Account ID
   * @param routeId Route ID
   * @return DeleteEntry
  */
  public DeleteEntry deleteAccountRoute (Integer accountId, Integer routeId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling deleteAccountRoute",
        new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAccountRoute"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling deleteAccountRoute",
        new ApiException(400, "Missing the required parameter 'routeId' when calling deleteAccountRoute"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/routes/{route_id}".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (DeleteEntry) ApiInvoker.deserialize(localVarResponse, "", DeleteEntry.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Delete a route from the account.
   * Delete a route from the account. See Intro to Routes for more info on the properties.
   * @param accountId Account ID   * @param routeId Route ID
  */
  public void deleteAccountRoute (Integer accountId, Integer routeId, final Response.Listener<DeleteEntry> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling deleteAccountRoute",
        new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAccountRoute"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling deleteAccountRoute",
        new ApiException(400, "Missing the required parameter 'routeId' when calling deleteAccountRoute"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/routes/{route_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((DeleteEntry) ApiInvoker.deserialize(localVarResponse,  "", DeleteEntry.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Show details of an individual route.
  * Show details of an individual route. See Intro to Routes for more info on the properties.
   * @param accountId Account ID
   * @param routeId Route ID
   * @return RouteFull
  */
  public RouteFull getAccountRoute (Integer accountId, Integer routeId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling getAccountRoute",
        new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountRoute"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling getAccountRoute",
        new ApiException(400, "Missing the required parameter 'routeId' when calling getAccountRoute"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/routes/{route_id}".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (RouteFull) ApiInvoker.deserialize(localVarResponse, "", RouteFull.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Show details of an individual route.
   * Show details of an individual route. See Intro to Routes for more info on the properties.
   * @param accountId Account ID   * @param routeId Route ID
  */
  public void getAccountRoute (Integer accountId, Integer routeId, final Response.Listener<RouteFull> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling getAccountRoute",
        new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountRoute"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling getAccountRoute",
        new ApiException(400, "Missing the required parameter 'routeId' when calling getAccountRoute"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/routes/{route_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((RouteFull) ApiInvoker.deserialize(localVarResponse,  "", RouteFull.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get a list of routes for an account.
  * Get a list of routes for an account. See Intro to Routes for more info on the properties.
   * @param accountId Account ID
   * @param filtersId ID filter
   * @param filtersName Name filter
   * @param sortId ID sorting
   * @param sortName Name sorting
   * @param limit Max results
   * @param offset Results to skip
   * @param fields Field set
   * @return ListRoutes
  */
  public ListRoutes listAccountRoutes (Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling listAccountRoutes",
        new ApiException(400, "Missing the required parameter 'accountId' when calling listAccountRoutes"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/routes".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[id]", filtersId));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[name]", filtersName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[id]", sortId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[name]", sortName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fields", fields));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ListRoutes) ApiInvoker.deserialize(localVarResponse, "", ListRoutes.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get a list of routes for an account.
   * Get a list of routes for an account. See Intro to Routes for more info on the properties.
   * @param accountId Account ID   * @param filtersId ID filter   * @param filtersName Name filter   * @param sortId ID sorting   * @param sortName Name sorting   * @param limit Max results   * @param offset Results to skip   * @param fields Field set
  */
  public void listAccountRoutes (Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final Response.Listener<ListRoutes> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling listAccountRoutes",
        new ApiException(400, "Missing the required parameter 'accountId' when calling listAccountRoutes"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/routes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[id]", filtersId));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[name]", filtersName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[id]", sortId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[name]", sortName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fields", fields));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ListRoutes) ApiInvoker.deserialize(localVarResponse,  "", ListRoutes.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Update the information of a route.
  * Update the information of a route. See Intro to Routes for more info on the properties.
   * @param accountId Account ID
   * @param routeId Route ID
   * @param data Route data
   * @return RouteFull
  */
  public RouteFull replaceAccountRoute (Integer accountId, Integer routeId, CreateRouteParams data) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = data;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling replaceAccountRoute",
        new ApiException(400, "Missing the required parameter 'accountId' when calling replaceAccountRoute"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling replaceAccountRoute",
        new ApiException(400, "Missing the required parameter 'routeId' when calling replaceAccountRoute"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/routes/{route_id}".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (RouteFull) ApiInvoker.deserialize(localVarResponse, "", RouteFull.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Update the information of a route.
   * Update the information of a route. See Intro to Routes for more info on the properties.
   * @param accountId Account ID   * @param routeId Route ID   * @param data Route data
  */
  public void replaceAccountRoute (Integer accountId, Integer routeId, CreateRouteParams data, final Response.Listener<RouteFull> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = data;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling replaceAccountRoute",
        new ApiException(400, "Missing the required parameter 'accountId' when calling replaceAccountRoute"));
    }
    // verify the required parameter 'routeId' is set
    if (routeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'routeId' when calling replaceAccountRoute",
        new ApiException(400, "Missing the required parameter 'routeId' when calling replaceAccountRoute"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/routes/{route_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "route_id" + "\\}", apiInvoker.escapeString(routeId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((RouteFull) ApiInvoker.deserialize(localVarResponse,  "", RouteFull.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
