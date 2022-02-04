# AWS Parameter Store
Externalize the Spring Boot application properties to an AWS Systems Manger Parameter Store.

## Tech Stack
Java 11
Spring Boot 2.5.0
Spring AWS Cloud 2.3.2



## Usage
Set environment variables:
- AWS_ACCESS_KEY_ID=yourAccessKeyID
- AWS_SECRET_ACCESS_KEY=yourAccessKey
- AWS_EC2_METADATA_DISABLED=true
before starting the application or unit test.

## References
[Parameter Format - Spring Cloud documentation](https://cloud.spring.io/spring-cloud-static/spring-cloud-aws/2.2.0.RELEASE/reference/html/#integrating-your-spring-cloud-application-with-the-aws-parameter-store)

[Credential Configuration - AWS Java SDK Documentation](https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/setup.html#setup-credentials)

https://github.com/awspring/spring-cloud-aws

https://awspring.io/

