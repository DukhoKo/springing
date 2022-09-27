# Spring boot

## 자동 설정 이해
@EnableAutoConfiguration (@SpringBootApplication 안에 숨어 있음)
● 빈은 사실 두 단계로 나눠서 읽힘
    ○ 1단계: @ComponentScan
    ○ 2단계: @EnableAutoConfiguration
● @ComponentScan
    ○ @Component
    ○ @Configuration @Repository @Service @Controller @RestController
ComponentScan은 ComponentScan이 있는 하위의 것들만 Bean으로 만든다. 다른 패키지에 있는건 Bean으로 만들지 않는다.
● @EnableAutoConfiguration
    ○ spring.factories
        ■ org.springframework.boot.autoconfigure.EnableAutoConfiguration
    ○ @Configuration
    ○ @ConditionalOnXxxYyyZzz

● Xxx-Spring-Boot-Autoconfigure 모듈: 자동 설정
● Xxx-Spring-Boot-Starter 모듈: 필요한 의존성 정의
● 그냥 하나로 만들고 싶을 때는?
○ Xxx-Spring-Boot-Starter