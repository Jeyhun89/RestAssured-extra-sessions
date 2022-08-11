package com.cydeo.tests.officehours.day2;

public class APITask2 {

    /**
     Please use jsonPath approach to extract values from response.

     ORDS API:
     Q1:
     - Given accept type is Json
     - Path param value- US
     - When users sends request to /countries
     - Then status code is 200
     - And Content - Type is Json
     - And country_id is US
     - And Country_name is United States of America
     - And Region_id is 2

     Q2:
     - Given accept type is Json
     - Query param value - q={"department_id":80}
     - When users sends request to /employees
     - Then status code is 200
     - And Content - Type is Json
     - And all job_ids start with 'SA'
     - And all department_ids are 80
     - Count is 25
     Q3:
     - Given accept type is Json
     -Query param value q= region_id 3
     - When users sends request to /countries
     - Then status code is 200
     - And all regions_id is 3
     - And count is 6
     - And hasMore is false
     - And Country_name are;
     Australia,China,India,Japan,Malaysia,Singapore

     */

}
