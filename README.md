
# ESTSOFT Final Project
---
# Mogakcote Project 
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/MySQL-4169E1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white"> <img src="https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=AmazonAWS&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white"/> <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"/> <img src="https://img.shields.io/badge/Amazon AWS-232F3E?style=for-the-badge&logo=amazonaws&logoColor=white"/> <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white"/>




> 자신의 코딩테스트 풀이에 대한 Alan AI의 리뷰를 원하는 사람들을 위한 커뮤니티

## 📖Description

### 주제

- 코딩 테스트 도우미 Code Quest Helper
- 코딩 테스트 문제 풀이 및 유저의 풀이에 대한 리포트 서비스

### 기획 의도

- 최근 개발자에게 코딩 테스트는 필수적인 상황이 되었으며 그 난이도는 점차 높아지고 있다.
- 단순히 문제를 푸는 것 NO!! 사용자가 푼 코드를 시간복잡도/공간복잡도 등을 고려하여 퀄리티 향상을 목표로 한다.
- 프로그래머스는 알고리즘 카테고리(Greedy 등)별 문제 확인이 어렵다.(카테고리 선택이 있긴 하지만, 문제들이 잘 나눠져있지 않고 개수가 적다.)
- 백준은 카테고리를 그나마 확인할 수 있지만, 프로그래머스 등과 같은 공간에서 확인할 수 있는 시스템이 필요하다.
  
=> 따라서 한눈에 다양한 서비스를 제공하고, 사용자의 코드의 퀄리티를 향상시킬수 있게 도와주고 싶어 이 웹 어플리케이션을 만들자.




### 1. 💾**개발 환경**
![개발환경](https://github.com/user-attachments/assets/e4d258b9-2623-4b15-87ca-2adb51daaecb)
- Java JDK 17
- Back-end : Spring Boot
- Front-end : HTML, CSS, JS, Thymeleaf
- Auth : Spring Security, JWT
- DB : MySQL
- ORM : JPA, Querydsl
- 배포 환경 : AWS EC2, RDS, Docker
- 협업도구 : GitHub, Notion, Figma, ERDCloud, Discord


## 2. **기능 명세서**
- 게시판   
![글 목록](https://github.com/user-attachments/assets/b4f2073b-be2a-406d-86a6-82658bc11482)   
![글 쓰기](https://github.com/user-attachments/assets/4e9bdaf4-4420-4c02-a74d-f244919c5a2b)     
![글 수정](https://github.com/user-attachments/assets/cb0d5c89-1937-47be-a198-70b73e43e9ac)     
![글 삭제](https://github.com/user-attachments/assets/b403f193-1bfc-4a19-8512-875708946f8f)      
![글 조회 페이지](https://github.com/user-attachments/assets/f737446a-8b12-490d-807d-157637555323)   

- 회원 및 관리자   
![로그인](https://github.com/user-attachments/assets/18f690d3-022e-4a32-8f31-914fe1b63b62)   
![회원가입](https://github.com/user-attachments/assets/16ab975b-6bfc-444d-a255-b677559721dc)   
![로그아웃 탈퇴](https://github.com/user-attachments/assets/7e36707c-27b6-4395-8018-90a25abacf2b)   
![관리자 페이지](https://github.com/user-attachments/assets/7a9c55c2-78a2-4316-8e04-251e550ea340)   


## 3. ✨UI(화면) 설계서 
- [피그마 링크 바로가기](https://www.figma.com/design/aozGh2OXMbjzGZTOw2yqdf/Food%2FCooking-Recipe-website-design-(Community)?node-id=0-3&t=rwlxgjsQjsXHZpRp-0)

|                                                                                                                       |                                                                                                                   |
|-----------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| Main Page (Member)                                                                                                    | Main Page (Guest)                                                                                                 |
| ![요리조리 멤버 홈페이지](https://github.com/user-attachments/assets/e9974255-f138-41f6-adc1-54690ae1e452) | ![게스트 화면](https://github.com/user-attachments/assets/87f8722d-4eeb-4b61-a61a-938c878e3364)|
| SignUp Page                                                                                              | SignIn Page  
| ![요리조리 회원가입](https://github.com/user-attachments/assets/ad287ff9-46e5-4bab-a328-a0636b113f4d)      | ![요리조리 로그인](https://github.com/user-attachments/assets/3d0895cb-baba-4556-8215-e49ac44fff5b)                           |
| MyPage Info Select                                                                                        | Modify-info Page                                                                                                  |
| ![요리조리 마이페이지 정보 선택](https://github.com/user-attachments/assets/6849807d-486a-4dd9-9446-229def53e687)       | ![요리조리 마이페이지 정보수정](https://github.com/user-attachments/assets/26049d18-c90f-4524-9a1a-1689aeef3b57) |
| Find ID / Password Page                                                                                               | Manage Member Authorization                                                                                       |
| ![요리조리 아이디비번 찾기](https://github.com/user-attachments/assets/e0d001e7-9666-4e45-80a2-fc3a97fe882e) | ![요리조리 회원 권환 관리](https://github.com/user-attachments/assets/f3a70b2d-59be-4484-b8ec-b32d4cddbb8a)    |
| Board Write Page                                                                                             |
| ![요리조리 게시글 생성 화면](https://github.com/user-attachments/assets/870cc776-8e68-4d64-af6f-921d5b35924a) |

## 4. 📖개발일정
![개발 일정표](https://github.com/user-attachments/assets/b7326bec-829f-4b05-812f-4b94a468b820)

### 🌐 Front-End
```
📁 src
└── 📁 main/resources
     ├── 📁 static
     |     ├── 📁 css
     |     |    ├── 📃 admin.css
     |     |    ├── 📃 home.css
     |     |    ├── 📃 login.css
     |     |    ├── 📃 logo.png
     |     |    ├── 📃 noticeStyle.css
     |     |    ├── 📃 searchIcon.css
     |     |    └── 📃 style.css
     |     ├── 📁 img
     |     |    └── 📃 mouse.png
     |     └── 📁 js
     |          ├── 📃 admin.js
     |          ├── 📃 home.js
     |          ├── 📃 login.js
     |          └── 📃 script.js
     └── 📁 templates
           ├── 📁 comment
           |    ├── 📁 css
           |    |    └── 📃 comment.css
           |    └── 📁 html
           |    |    └── 📃 comment.html
           ├── 📁 search
           |    ├── 📁 css
           |    |    └── 📃 search.css
           |    ├── 📁 html
           |    |    └── 📃 search.html
           |    ├── 📁 img
           |    |    ├── 📃 food.png
           |    |    ├── 📃 mouse.png
           |    |    └── 📃 searchIcon-black.png
           |    └── 📁 script
           |         └── 📃 search.js
           ├── 📃 admin.html
           ├── 📃 editNotice.html
           ├── 📃 editPost.html
           ├── 📃 find.html
           ├── 📃 home.html
           ├── 📃 login.html
           ├── 📃 noticeDetail.html
           ├── 📃 postDetail.html
           ├── 📃 writeNotice.html
           └── 📃 writePost.html

```
### ⚙️ Back-End
```
📁 src
├── 📁 admin
│   ├── 📁 application
|   |   └── 📃 AdminService.java
│   └── 📁 dto
|   |   ├── 📃 AdminRequest.java
|   |   └── 📃 AdminResponse.java
│   └── 📁 presentation
|       └── 📃 AdminController.java
├── 📁 auth
│   ├── 📁 controller
|   |   └── 📃 AuthController.java
│   ├── 📁 domain
|   |   ├── 📃 Role.java
|   |   └── 📃 User.java
│   ├── 📁 dto
|   |   ├── 📃 FindPasswordRequest.java
|   |   ├── 📃 LoginRequest.java
|   |   └── 📃 SignupRequest.java
│   ├── 📁 repository
|   |   └── 📃 UserRepository.java
│   └── 📁 service
|       └── 📃 UserService.java
├── 📁 common
│   ├── 📁 entity
|   |   └── 📃 BaseEntity.java
│   └── 📁 handle
|       └── 📃 AuthInterceptor.java
├── 📁 config
│   └── 📁 jpa
|   |   └── 📃 JpaConfig.java
│   └── 📁 web
|       └── 📃 WebConfig.java
├── 📁 exception
|   └── 📃 GlobalExceptionHandler.java
├── 📁 home/controller
│   └── 📃 HomeController.java
├── 📁 notice
│   ├── 📁 application
|   |   └── 📃 NoticeService.java
│   ├── 📁 domain
|   |   └── 📃 Notice.java
│   ├── 📁 dto/request
|   |   └── 📃 NoticeRequest
│   ├── 📁 infrastructure
|   |   └── 📃 NoticeRepository.java
│   └── 📁 presentaion
|       └── 📃 NoticeController.java
└── 📁 post
    ├── 📁 controller
    |   ├── 📃 PostController.java
    ├── 📁 dto
    |   ├── 📁 request
    |   │   └── 📃 PostRequest.java
    |   └── 📁 request
    |        └── 📃 PostSaveResponse.java
    ├── 📁 entity
    |   ├── 📃 FoodCategory.java
    |   ├── 📃 Post.java
    |   └── 📃 PostDetail.java
    ├── 📁 repository
    |   ├── 📃 PostDetailRepository.java
    |   └── 📃 PostRepository.java
    └── 📁 service
        └── 📃 PostService.java


```

## 🏭System Structure
![시스템 구조](https://github.com/user-attachments/assets/c89728f8-868a-450e-873b-17fd510c5ba8)

## 🔐ERD Structure
![erd-diagram](https://github.com/user-attachments/assets/0f301366-3090-46d4-95d4-6f366251009a)

## ♒배포 흐름도
![배포 흐름도](https://github.com/user-attachments/assets/46e6bb59-14c9-4b89-84c4-65e14630f7ee)

## 🎈API 명세서

### 🧑‍🍳 메인 페이지
| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| mainPosts | GET | /api/v1/post/list | 1. 모든 게시글을 불러옴
2. keyword가 있으면 제목 및 내용에 keyword가 포함된 게시글을 불러옴
3. algorithm가 있으면 algorithm가 일치하는 게시글만 불러옴
4. language가 있으면 language가 일치하는 게시글만 불러옴
5. 코드 통과 성공 혹은 무관을 선택하면 boolean 형태로 checkSuccess의 결과값으로 연결하여 해당하는 게시글을 불러옴 
6. sortBy가 있으면 sortBy 순으로 게시글을 불러옴 |  |  |  |


### 🧑‍🍳 관리자 페이지

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| createAlgorithm | POST | /api/v1/admin/algorithms | 알고리즘 생성 |  |  |  |
| updateAlgorithm | PUT | /api/v1/admin/algorithms/{id} | 알고리즘 변경 |  |  |  |
| deleteAlgorithm | DELETE | /api/v1/admin/algorithms/{id} | 알고리즘 삭제 |  |  |  |
| algorithmList | GET | /api/v1/admin/algorithms/list | 알고리즘 조회 |  |  |  |
| createLanguage | POST | /api/v1/admin/languagges | 작성 언어 생성 |  |  |  |
| updateLanguage | PUT | /api/v1/admin/languagges/{id} | 작성 언어 수정 |  |  |  |
| deleteLanguage | DELETE | /api/v1/admin/languagges/{id} | 작성언어 삭제 |  |  |  |
| getLanguageList | GET | /api/v1/admin/languagges/list | 작성언어 조회 |  |  |  |
| createPlatform | POST | /api/v1/admin/platforms | 플랫폼 생성 |  |  |  |
| updatePlatform | PUT | /api/v1/admin/platforms/{id} | 플랫폼 수정 |  |  |  |
| deleteLanguage | DELETE | /api/v1/admin/platforms/{id} | 플랫폼 삭제 |  |  |  |
| getPlatformList | GET | /api/v1/admin/platforms | 플랫폼 조회 |  |  |  |

### 🧑‍🍳 뱃지 기능

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| createBadge | POST | /api/v1/admin/createBadge | 뱃지 생성 |  |  |  |
| getBagdeById | GET | /api/v1/admin/badge/{badgeId} | 아이디에 해당하는 뱃지 조회 |  |  |  |
| getBagdes | GET | /api/v1/admin/badge/list | 뱃지 조회 |  |  |  |
| updateBadge | PUT | /api/v1/admin/updateBadge/{badgeId} | 뱃지 수정 |  |  |  |
| deleteBadge | DELETE | /api/v1/admin/deleteBadge/{badgeId} | 뱃지 삭제 |  |  |  |

### 🧑‍🍳 공지사항

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| getNotic | GET | /api/v1/notice/{noticeId} | 공지사항 조회 |  |  |  |
| createNotice | POST | /api/v1/notice | 공지사항 생성 |  |  |  |
| updateNotice | PUT | /api/v1/notice/{notice_id} | 공지사항 수정 |  |  |  |
| deleteNotice | DELETE | /api/v1/notice/{notice_id} | 공지사항 삭제 |  |  |  |
| noticeList | GET | /api/v1/notice/list | 공지사항 목록 |  |  |  |
| showEditForm | GET | /api/v1/notice/{noticeId}/edit | 공지사항 수정 화면 |  |  |  |
| noticeLatest5List | GET | /api/v1/notice/latest5List | 최근 공지사항 5개 목록 |  |  |  |

### 🧑‍🍳 알림

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| createNews | POST | /api/v1/news | 알림 생성 ( 권한-관리자, 자동 ) |  |  |  |
| getNews | GET  | /api/v1/news/{newsId} | 알림 조회 |  |  |  |
| updateNews | PUT  | /api/v1/news/{newsId} | 알림 수정 |  |  |  |
| deleteNews | DELETE  | /api/v1/news/{noticeId} | 알림 삭제 |  |  |  |
| getAllNews | GET  | /api/v1/news/list | 전체 알림 목록 |  |  |  |

### 🧑‍🍳 댓글

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| createComment | POST  | /api/v1/posts/{postId}/comments | 댓글 등록 |  |  |  |
| updateComment | PUT  | /api/v1/posts/{postId}/comments/{commentId} | 댓글 수정 |  |  |  |
| deleteComment | DELETE | /api/v1/posts/{postId}/comments/{commentId} | 댓글 삭제 |  |  |  |
| getCommentList | GET  | /api/v1/posts/{postId}/comments/list | 댓글 목록 조회 |  |  |  |
| getSystemComment | GET  | /api/v1/posts/{postId}/system-comments | 시스템 댓글 조회 |  |  |  |

### 🧑‍🍳 좋아요

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| clickVote | POST  | /api/v1/posts/{postId}/votes | 좋아요 및 좋아요 취소 |  |  |  |

### 🧑‍🍳 게시글

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| createPost | POST  | /api/v1/post | 게시글 작성 |  |  |  |
| getPost | GET  | /api/v1/post/{postId} | 게시글 조회 |  |  |  |
| getAllPosts | GET  | /api/v1/post | 게시글 조회 |  |  |  |
| modifyPost | PUT  | /api/v1/post/{postId} | 게시글 수정 |  |  |  |
| deletePost | DELETE  | /api/v1/post/{postId} | 게시글 삭제 |  |  |  |

### 🧑‍🍳 회원가입

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| validatePassword | POST  | /api/v1/signup/validate-password | 비밀번호 규칙 검증 |  |  |  |
| setPassword | POST  | /api/v1/signup/set-password | 비밀번호 설정 |  |  |  |
| registerUser | POST  | /api/v1/users/register | 회원가입 완료 |  |  |  |
| checkNickName | GET  | /api/v1/users/check-nickname | 사용자명 중복 확인 |  |  |  |
| checkEmail | GET  | /api/v1/users/check-email | 이메일 중복 확인 |  |  |  |

### 🧑‍🍳 인증/권한

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| login | POST | /api/v1/auth/login | 로그인 |  |  |  |
| refresh | POST | /api/v1/auth/refresh | access token 새로고침 |  |  |  |
| logout | POST | /api/v1/auth/logout | 로그아웃 |  |  |  |
| findEmail | GET | /api/v1/auth/email | 이메일 찾기 |  |  |  |
| sendPasswordResetMail | POST | /api/v1/auth/reset-password-mail | 비밀번호 초기화 메일 발송 |  |  |  |
| resetPassword | POST | /api/v1/auth/reset-password | 비밀번호 초기화 |  |  |  |

### 🧑‍🍳 마이페이지

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| getUserProfile | GET | /api/v1/profile/{nickname} | 사용자 프로필 조회 |  |  |  |
| getUserBadge | GET | /api/v1/users/badges | 사용자 뱃 조회 |  |  |  |

### 🧑‍🍳 마이페이지 수정

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| updateProfile | PUT | /api/v1/profile/edit | 사용자 프로필 수정 |  |  |  |
| changePassword | POST | /api/v1/change-password | 비밀번호 수정 |  |  |  |
| deleteAccount | DELETE | /api/v1/profile/{nickname} | 회원 탈퇴 |  |  |  |

### 🧑‍🍳 에러 페이지

| 🏷 NAME | ⚙ METHOD | 📎 URL | 📖 DESCRIPTION |
| --- | --- | --- | --- | 
| handleBuisnessException | GET | /error | 에러페이지로 에러 데이터 전송 |  |  |  |


## 🎞시연 영상
---





## 🛠Coding Convention

[코딩 컨벤션](https://www.notion.so/oreumi/b127ced1b2e746f38382d8f0526adc75)

## 👨‍💻Participation Member
- 오한얼
- 백의헌
- 서원종
- 김민주
- 유석호
- 이재준

