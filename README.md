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


## 내장 웹서버 이해
스프링 부트는 서버가 아니다.
    ○ 톰캣 객체 생성
    ○ 포트 설정
    ○ 톰캣에 컨텍스트 추가
    ○ 서블릿 만들기
    ○ 톰캣에 서블릿 추가
    ○ 컨텍스트에 서블릿 맵핑
    ○ 톰캣 실행 및 대기
● 이 모든 과정을 보다 상세히 또 유연하고 설정하고 실행해주는게 바로 스프링 부트의 자동 설정
    ○ ServletWebServerFactoryAutoConfiguration (서블릿 웹 서버 생성)
        ■ TomcatServletWebServerFactoryCustomizer (서버 커스터마이징)
    ○ DispatcherServletAutoConfiguration
        ■ 서블릿 만들고 등록