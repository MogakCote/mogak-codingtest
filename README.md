
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
![MogakCote Architecture](https://github.com/user-attachments/assets/4aeaff3c-9116-402a-8a06-28936d15d3f8)
- Java JDK 17
- Back-end : Spring Boot
- Front-end : HTML, CSS, JS, Thymeleaf
- Auth : Spring Security, JWT
- DB : MySQL
- ORM : JPA, Querydsl
- 배포 환경 : AWS EC2, RDS, Docker
- 협업도구 : GitHub, Notion, Figma, ERDCloud, Discord


## 2. **기능 명세서**
- 게시글   
![게시글 상세 페이지](https://github.com/user-attachments/assets/3118755d-44ed-4089-8709-7fadd483a3f8)
![게시글 수정 페이지](https://github.com/user-attachments/assets/81996060-3d0e-4cc3-bb6a-6c72b5683fbc)
![게시글 작성 페이지](https://github.com/user-attachments/assets/ce586dbc-40cc-4286-af19-8e3db9497d3f)   

- 공지사항       
![공지사항 상세 페이지](https://github.com/user-attachments/assets/d8361672-1dec-4e8b-9b85-4a178d0f19c3)
![공지사항 작성 및 수정 페이지](https://github.com/user-attachments/assets/be19fba7-6060-4316-80df-3118000429f3)

- 관리자 페이지   
![관리자 페이지](https://github.com/user-attachments/assets/6d667176-9247-4ef3-9a23-705f7c02f9da)

- 로그인 페이지   
![로그인 페이지](https://github.com/user-attachments/assets/e25af43b-f97d-43b2-821f-01db92e67712)

- 메인 페이지   
![메인 페이지](https://github.com/user-attachments/assets/b8bc2502-7c8d-450e-8450-16c2e209f925)

- 비밀번호 페이지   
![비밀번호 페이지](https://github.com/user-attachments/assets/a841521f-31a4-4c33-a001-d0a9bab1a3d3)

- 사용자 프로필 페이지   
![사용자 프로필 수정 페이지](https://github.com/user-attachments/assets/7e5d20ba-3087-409f-903f-dc2d1d4e0461)
![사용자 프로필 페이지](https://github.com/user-attachments/assets/3cd716fe-b97c-4d64-a415-a3df65df2c6d)

- 이메일 페이지   
![이메일 페이지](https://github.com/user-attachments/assets/aacc470b-da58-4acc-8515-76bd1b51eeb2)

- 회원 가입 페이지   
![회원가입 페이지](https://github.com/user-attachments/assets/f09bd08a-3872-4385-af4e-ece0d0b7d0be)

- 회원 관리 페이지   
![회원관리](https://github.com/user-attachments/assets/4277c9b8-8f61-49f8-9044-c6836e4003da)

## 3. ✨UI(화면) 설계서 
- [피그마 링크 바로가기](https://www.figma.com/design/yqi7pKRtBkjGSY0kwr7ijQ/Untitled?node-id=0-1&node-type=canvas&t=WbekpxmRE9Ay8diQ-0)

|                                                                                                                       |                                                                                                                   |
|-----------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|
| Main Page                                                                                                    | My Page (                                                                                                 |
| ![메인 페이지](https://github.com/user-attachments/assets/3e4690e6-ea6f-4123-b1e2-02e943327b43) | ![마이페이지](https://github.com/user-attachments/assets/22a9c0de-b5b1-4041-9d5d-28c1b3fb9237) |
| SignUp Page                                                                                              | SignIn Page  
| ![회원가입](https://github.com/user-attachments/assets/b56592b8-4012-4b6a-a07b-e20b5e7f646d)      | ![로그인](https://github.com/user-attachments/assets/bdf02831-a04e-4bfc-ad86-f7bf4e637804)                           |
| 게시글 작성                                                                                        | 게시글 작성 - 코드           |
| ![게시글 작성](https://github.com/user-attachments/assets/48186167-16ee-458a-9465-47cff09963fd)       | ![게시글 작성 - 코드](https://github.com/user-attachments/assets/5b67df36-db87-4640-8022-e5bf2c3d311a) |
| 게시글 상세보기                                                                                           | 게시글 상세보기 - 시스템 댓글                                                                                       |
| ![게시글 상세보기](https://github.com/user-attachments/assets/fd18db84-6ab4-4080-963a-e848835b5abd) |  ![게시글 상세보기 - 시스템댓글 열어보기](https://github.com/user-attachments/assets/3c642542-dec5-4cbd-bd08-79c0e532129b) |
| 공지사항 생성                                                                                          | 공지사항 상세보기                                                                                       |
| ![공지사항 생성](https://github.com/user-attachments/assets/7ea191a9-c4ca-46c0-a311-41d1fbe5a05f)  |  ![공지사항 상세보기](https://github.com/user-attachments/assets/0038e769-5474-46aa-9b9e-7026716c7d63) |
| 이메일 확인                                                                                          | 이메일 찾기                                                                                       |
| ![이메일 확인](https://github.com/user-attachments/assets/9e206520-6f5d-4554-a278-95c80a5c741d)  |  ![이메일 찾기](https://github.com/user-attachments/assets/22a757d4-5271-4ee3-9181-9b34e87cda27) |
| 비밀번호 변경                                                                                          | 비밀번호 찾기                                                                                       |
| ![비밀번호 변경](https://github.com/user-attachments/assets/aaaf5c49-5e1f-4a30-8e11-ae6fe371bf90)  |  ![비밀번호 찾기](https://github.com/user-attachments/assets/d13d7328-0e22-4949-9cd7-4d3482b63dec) |
| 관리자 페지                                                                                         | 마이페이지 수정                                                                                       |
| ![관리자 페이지](https://github.com/user-attachments/assets/4922eabb-a00c-4ab9-81fa-858d2fb67d4b)  |  ![마이페이지 수정](https://github.com/user-attachments/assets/d7452251-243c-436e-b260-41fac4409929) |

## 4. 📖개발일정   
![개발일정](https://github.com/user-attachments/assets/46a70cab-e0e3-496d-85d0-298ec18fd7bd)

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
<img width="1574" alt="erd" src="https://github.com/user-attachments/assets/758ca007-b022-409e-9f6b-7b9481056eb4">

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

