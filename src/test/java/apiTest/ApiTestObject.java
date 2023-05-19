//package apiTest;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import static io.restassured.RestAssured.given;
//
//public class ApiTestObject {
//    @BeforeAll
//    public static void setup() {
//        RestAssured.baseURI = "http://localhost/api/rest";
//    }
//
//    @Test
//    public void getRequest() {
//        Response response = given()
//                .header("Authorization","DeHwc5bcfiaeCaWuR_jZTYQwRa3eloRR")
////                .contentType(ContentType.JSON)
//                .when()
//                .get("/projects")
//                .then()
//                .extract().response();
//
//        Assertions.assertEquals(200, response.statusCode());
//
//    }
//}