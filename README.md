# Our time is On

서비스 주소: https://hvvany.github.io/oiso/ <br>
깃허브 프론트엔드: https://github.com/hvvany/OISO_FE <br>
깃허브 백엔드 : https://github.com/da010228/OISO_BE

## 나만의 여행 계획 서비스

![](https://velog.velcdn.com/images/hvvany/post/3108a5a7-8860-446b-8f09-0b01be445f9b/image.png)

> Our time is On
> 국내 여행지를 모바일로 손쉽게 찾을 수 있는 웹 어플리케이션 서비스

<br>

## 웹사이트 주소

👉🏻 https://hvvany.github.io/oiso/

![](https://velog.velcdn.com/images/hvvany/post/7de1341d-2cd6-4126-8086-5c85fcaaadba/image.png)

<br>

# 팀 구성

<table>
  <tbody>
    <tr>
      <td align="center"><a href=""><img src="https://avatars.githubusercontent.com/u/106108151?v=4" width="200px;" alt=""/><br /><sub><b>Jun Hwan</b></sub></a><br /></td>
      <td align="center"><a href=""><img src="https://avatars.githubusercontent.com/u/69593799?v=4" width="200px;" alt=""/><br /><sub><b>Da Eun</b></sub></a><br /></td>
     <tr/>
  </tbody>
</table>

<br>

# 프로젝트 수행 도구

## 프론트엔드

![](https://img.shields.io/badge/Vue.js-35495E?style=for-the-badge&logo=vuedotjs&logoColor=4FC08D)![](https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)![]()

## 백엔드

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F0BU43%2Fbtrh9CBOeGh%2FytKqnwGGrodHyh7pfNcKrK%2Fimg.jpg)![](https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)![](https://img.shields.io/badge/apachetomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white)

## 데이터 베이스

![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)

<br>

# 프로젝트 일정

> 2023.05.05 ~ 2023.05.26 (3주)

![](https://velog.velcdn.com/images/hvvany/post/ba6722e9-31a8-4088-984f-f102461b3646/image.png)

<br>

# 프로젝트 구성

## 템플릿 구성도 ( Figma )

> https://www.figma.com/file/JjtNWTaMerWoLtUOchbd3s/OISO?type=design&node-id=0-1&t=L2JQESTuvP96NJwv-0

![](https://velog.velcdn.com/images/hvvany/post/742662fa-6094-4b21-a392-f4eb7cdcf645/image.png)
![](https://velog.velcdn.com/images/hvvany/post/aedb812e-02ed-4855-816b-c339fb7146cf/image.png)

---

## Use Case Diagram

![](https://velog.velcdn.com/images/hvvany/post/8967ef71-7172-4979-8af4-81c3f5d665a1/image.png)

---

## 모델 구성도 ( mySQL Workbench )

![](https://velog.velcdn.com/images/hvvany/post/67606a41-1c26-4c36-832f-4d3cbfa2675c/image.png)

## Class Diagram

![](https://velog.velcdn.com/images/hvvany/post/6195a893-83a6-48f9-88f5-a858e943c793/image.png)

![](https://velog.velcdn.com/images/hvvany/post/86d20e94-c9cf-415a-8337-0e4ae9a98553/image.png)

![](https://velog.velcdn.com/images/hvvany/post/0822c466-a3e5-4f8b-98da-32b7aa4f3128/image.png)

![](https://velog.velcdn.com/images/hvvany/post/0334f959-3c25-4b25-b3b9-bbd3f4c1b2ee/image.png)

## API 명세서

| 우선 순위 |   앱    |               이름               |     메소드     |              요청 URL               |              상세 내용               |                                                                         참고사항                                                                          |
| :-------: | :-----: | :------------------------------: | :------------: | :---------------------------------: | :----------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     1     |  user   |          로그인 페이지           |      GET       |                  /                  |          로그인 페이지 이동          |                                                                                                                                                           |
|     1     |  user   |              로그인              |      POST      |             /user/login             |             로그인 요청              |                                                                                                                                                           |
|     1     |  user   |         회원가입 페이지          |      GET       |            /user/signup             |         회원가입 페이지 이동         |                                                                                                                                                           |
|     1     |  user   |             회원가입             |      POST      |            /user/signup             |          회원가입 정보 전송          |                                                                                                                                                           |
|     1     |  user   |            마이페이지            | GET,PUT,DELETE |           /user/{user_id}           |        내 정보 수정 삭제 조회        |                                                                                                                                                           |
|     1     |  user   |         멤버 관리페이지          |      GET       |            /user/member             |     멤버정보 조회\_관리자만 가능     |                                                                           admin                                                                           |
|     1     |  user   |          멤버 정보 수정          |   PUT,DELETE   |       /user/member/{user_id}        | 멤버 정보 수정 삭제 \_ 관리자만 가능 |                                                                           admin                                                                           |
|     1     |  trip   |          전체 메인 화면          |      GET       |                /trip                |            여행 메인 화면            |                                                           지역 및 필터 선택 가능한 조회 페이지                                                            |
|     1     |  trip   |       지역별 관광정보 화면       |      GET       |             /trip/info              |      지역별 관광정보 검색 화면       |                                                    관광지, 숙박, 음식, 문화시설, 공연, 쇼핑, 여행코스                                                     |
|     1     |  trip   |         지역별 관광정보          |      POST      |             /trip/info              |      지역별 관광정보 검색 조회       |                                                    관광지, 숙박, 음식, 문화시설, 공연, 쇼핑, 여행코스                                                     |
|     1     | article |   핫플레이스 공유 게시판 목록    |      GET       |          /article/hotplace          |          핫플 게시글 리스트          |                                                                                                                                                           |
|     1     | article |  핫플레이스 공유 게시판 글작성   |    GET,POST    |        /article/hotplace/new        |       핫플 게시글 작성 페이지        |                                                                                                                                                           |
|     1     | article |  핫플레이스 디테일, 수정, 삭제   | GET,PUT,DELETE |   /article/hotplace/{article_id}    |    핫플 게시글 디테일, 수정, 삭제    |                                                                                                                                                           |
|     1     | article |        핫플레이스 좋아요         |      POST      | /article/hotplace/{article_id}/like |          핫플 게시글 좋아요          |                                                                                                                                                           |
|  \*\*\*   | \*\*\*  |              \*\*\*              |     \*\*\*     |               \*\*\*                |                \*\*\*                |                                                                          \*\*\*                                                                           |
|     2     | article |        공유게시판 페이지         |      GET       |           /article/board            |       전체 게시글 보는 페이지        |                                                                                                                                                           |
|     2     | article |        공유게시판 글작성         |    GET,POST    |         /article/board/new          |          게시글 작성 페이지          |                                                                                                                                                           |
|     2     | article | 공유게시판 글 디테일, 수정, 삭제 | GET,PUT,DELETE |     /article/board/{article_id}     |       게시글 디테일, 수정 삭제       |                                                                                                                                                           |
|     2     | article |       공유게시판 글 좋아요       |      POST      |  /article/board/{article_id}/like   |            게시글 좋아요             |                                                                                                                                                           |
|     2     | article |          공지사항 조회           |      GET       |          /article/bulletin          |          전체 공지사항 보기          |                                                                                                                                                           |
|     2     | article |          공지사항 작성           |    GET,POST    |        /article/bulletin/new        |            공지사항 작성             |                                                                           admin                                                                           |
|     2     | article |   공지사항 디테일, 수정, 삭제    | GET,PUT,DELETE |   /article/bulletin/{article_id}    |     공지사항 디테일, 수정, 삭제      |                                                                           admin                                                                           |
|     2     | article |         공지사항 좋아요          |      POST      | /article/bulletin/{article_id}/like |           공지사항 좋아요            |                                                                                                                                                           |
|  \*\*\*   | \*\*\*  |              \*\*\*              |     \*\*\*     |               \*\*\*                |                \*\*\*                |                                                                          \*\*\*                                                                           |
|     3     | mytrip  |      나의 여행 계획 페이지       |      GET       |            /mytrip/{id}             |         나의 여행계획 페이지         | 처음에 계획 가져오면서 지역 정보 활용하여 날씨 뉴스 정보 첫 번째 지역 기준. 도시 선택 시 아래의 날씨, 뉴스 get 요청을 통해 지역에 맞는 정보 가져오기 요청 |
|     3     | mytrip  |       나의 여행 계획 추가        |      POST      |          /mytrip/plan/{id}          |        나의 여행계획 추가하기        |                                                                                                                                                           |
|     3     | mytrip  |       나의 여행 계획 수정        |      PUT       |          /mytrip/plan/{id}          |        나의 여행계획 수정하기        |                                                                                                                                                           |
|     3     | mytrip  |       나의 여행 계획 삭제        |     DELETE     |          /mytrip/plan/{id}          |        나의 여행계획 삭제하기        |                                                                                                                                                           |
|     3     | mytrip  |    나의 여행 상세 계획 페이지    |      GET       |          /{id}/{sido_code}          |     나의 여행계획 디테일 페이지      |                                                                                                                                                           |
|     3     | mytrip  |  나의 여행 상세 계획 추가 여부   |      GET       |      /detail/{id}/{contentId}       |         나의 계획 추가 여부          |                                                                                                                                                           |
|     3     | mytrip  |     나의 여행 상세 계획 추가     |      POST      |                /{id}                |      나의 여행 계획에 추가하기       |                                                                                                                                                           |
|     3     | mytrip  |     나의 여행 상세 계획 삭제     |     DELETE     |          /{id}/{contentId}          |     나의 여행 계획에서 삭제하기      |                                                                                                                                                           |
|     3     | mytrip  |  나의 여행 상세 계획 순서 변경   |      PUT       |       /{detatilNo}/{sequence}       |     나의 여행계획 순서 변경하기      |                                                                                                                                                           |
|  \*\*\*   | \*\*\*  |              \*\*\*              |     \*\*\*     |               \*\*\*                |                \*\*\*                |                                                                          \*\*\*                                                                           |
|     4     | mytrip  |    관광지 날씨 정보 가져오기     |      GET       |     /mytrip/weather/{sido_code}     |     관심 지역 날씨 정보 가져오기     |                                                                                                                                                           |

<br>

# 서비스 소개

## 주요 기능

- 여행지 지역별 검색
- 자유 게시판
- 핫플레이스 공유
- 공지사항
- 나만의 여행 계획
- openAI API 활용 맞춤 여행지 추천

<br>

## 회원가입

![](https://velog.velcdn.com/images/hvvany/post/f32356d6-60d6-422b-8641-a06b56e46c1a/image.gif)

<br>
<br>

## 로그인 & 메인페이지

![](https://velog.velcdn.com/images/hvvany/post/9d8841e1-0fb7-4329-99e5-e717dae88291/image.gif)

> JWT token을 활용하여 로그인 인증을 한다.

<br>
<br>

## 공지사항

![](https://velog.velcdn.com/images/hvvany/post/67aa88a6-adcd-48ac-a0e5-a56cf584ab52/image.gif)

> 관리자 권한을 가진 사람은 공지사항 등록 가능

<br>
<br>

## 게시판 & 핫플레이스

![](https://velog.velcdn.com/images/hvvany/post/42907235-ca4f-418b-a8eb-a0300cfb6a17/image.gif)

![](https://velog.velcdn.com/images/hvvany/post/162df76e-4093-404a-b953-26b08958c5aa/image.gif)

> 게시판의 CRUD를 구현하였다. 특히 핫플레이스는 좋아요 수를 기준으로 정렬하여준다. 메인 페이지는 3위까지 보여준다.

<br>
<br>

## OpenAI API 활용

![](https://velog.velcdn.com/images/hvvany/post/7f0aaf53-a9a1-4849-ac4b-bb591eb35d83/image.gif)

![](https://velog.velcdn.com/images/hvvany/post/6201e631-20cc-448a-aafc-7f1ff11b50ab/image.gif)

## 여행지 날씨

![](https://velog.velcdn.com/images/hvvany/post/6bb9135e-6968-41c3-8908-c71a4b013fab/image.gif)

> 내가 등록한 여행지의 날씨를 상단 스와이퍼로 정보를 제공한다.

## 나만의 여행 계획

![](https://velog.velcdn.com/images/hvvany/post/e5d25f94-0915-472f-9b45-329e75040058/image.gif)

## 관광지 정보 조회

![](https://velog.velcdn.com/images/hvvany/post/d9f74dd4-3569-4f6c-9c48-e79853f61dbb/image.gif)

![](https://velog.velcdn.com/images/hvvany/post/1875b302-6bba-4bd1-8278-4b48f60c10b5/image.gif)

> 한국관광공사의 API를 활용하여 지역별 관광지, 문화시설, 숙소 등의 다양한 정보를 제공한다.

<br>
<br>

## 개발 이슈

### 1. router는 엥간하면 name 쓰자

router를 사용할 때 name으로 사용하면 충돌 위험이 낮아진다.
경로를 직접 입력할 경우 의도하지 않게 get요청이 보내지는 현상이 일어났다.

### 2. 스프링 부트 이미지 저장 시 절대경로!

> 스프링 부트는 서버를 가상으로 돌리기 때문에 경로가 바뀐다. 따라서 진짜 tomcat서버의 경로를 통해 저장하는 방법을 사용하는 등의 절대 경로를 통해 저장해야한다.
> 가장 좋은 방법은 aws s3 같은 클라우드 서비스를 이용하여 서버에 파일을 바로 올리는 것이 좋다.
> 다음은 파일 저장을 위해 시도해본 작업들이다.

#### 1. html 에서 input type=”file”로 입력 받기

ArticleBoardNewView

```html
<input type="file" name="files" id="files" multiple="multiple" />
```

그러면 다음과 같이 input 요소가 생긴다

![](https://velog.velcdn.com/images/hvvany/post/e76d6e33-df89-42b1-80a4-e8a3f32e721f/image.png)

#### 2. API로 전송 시 JSON 말고 `formData`로 보낸다

처음에 이미지를 JSON 형태로 고칠려고 했으나 불가능.

JSON을 formData객체에 함께 담아서 보내줘야 한다.

ArticleBoardNewView 의 method 내부 post요청 부분

```jsx
...
methods: {
    sendArticle() {
      if ((this.content_text != "") & (this.content_title != "")) {
				// 폼 데이터로 보내줘야 하므로 객체 생성
        let formData = new FormData();
				// json형태로 바로 보내던 데이터를 일단 변수에 저장
        let data = {
          id: this.userInfo.userId,
          title: this.content_title,
          content: this.content_text,
        };
				// 그냥 files까지만 보내면 배열이 갈 줄 알았으나 배열 모양을 한 딕셔너리더라...{0:{이름:ㅇㅇ},1:...
	      // 얕은 복사(Array.from)을 통해 배열로 데이터를 바꾸어 저장해준다
				Array.from(document.querySelector("#files").files).forEach((file) => {
          formData.append("files", file);  // files로 같은 이름에 데이터를 append 하면 배열로 들어간다
          console.log(file);
        });

        formData.append(
          "key",
          new Blob([JSON.stringify(data)], { type: "application/json" })
        );

			//  => 위의 과정을 거치면 formData에는 'files'이름의 이미지 배열과
			//                                 'key'이름의 기존json데이터(이메일,제목 등)담김

				// 아래는 POST 요청 부분
        http
          .post("/article/board/new", formData, {
            headers: {
              "Content-Type": "multipart/form-data",  //기존의 json 대신 formData 설정
            },
            transformRequest: [
              function () {
                return formData;
              },
            ],
          })
          .then(({ status }) => {
            if (status == 200) {
              this.$router.push({ name: "board" });
            }
          });
      } else {
        alert("정보를 입력해 주세요");
      }
    },
  },

...
```

`Blob` : Binary Large Object. → javascript에서 이미지, 음성 등 대용량 데이터 다루는 객체

#### 3. 백엔드 Controller 로 넘어온 formData처리

ArticleController의 boardnew post 부분

```java
@PostMapping("/board/new")
	int postBoard(@RequestPart(value = "key") Article article, @RequestPart(value = "files", required = false) MultipartFile[] files) throws Exception {
// formData는 RequestPart 어노테이션을 통해 MultipartFile 클래스로 데이터를 받는다. 여기서 required = false 를 안해주니 에러가 발생하였다.

		System.out.println("article : " + article + ", files : " + files);
// 프린트 : article : Article [articleNo=0, title=asdf, id=ssafy, content=asdf, regTime=null], files : [Lorg.springframework.web.multipart.MultipartFile;@4049d099

		String realPath = "/Users/hvvany/Desktop/OISO_BE/last_pjt/trip/src/main/resources/static/imgs";  // 스프링 부트에서 파일 저장 시 상대경로로 하면 경로 못찾음
		String today = new SimpleDateFormat("yyMMdd").format(new Date());
		File folder = new File(realPath);
		if (!folder.exists()) {
			folder.mkdirs();
		}
		List<FileInfo> fileInfos = new ArrayList<FileInfo>();
		for (MultipartFile mfile : files) {
			FileInfo fileInfo = new FileInfo();
			String originalFileName = mfile.getOriginalFilename();
// 파일 경로 없으면 폴더 생성
			if (!originalFileName.isEmpty()) {
				String saveFileName = UUID.randomUUID().toString()  // UUID는 이미지 이름 중복 방지 위해 랜덤하게 생성된 고유값
						+ originalFileName.substring(originalFileName.lastIndexOf('.'));
				fileInfo.setSaveFolder(today);
				fileInfo.setOriginFile(originalFileName);
				fileInfo.setSaveFile(saveFileName);

				mfile.transferTo(new File(folder,saveFileName));
//			FileCopyUtils.copy(mfile.getInputStream(), new FileOutputStream(realPath + Paths.get(saveFileName).toFile()));
			}
			fileInfos.add(fileInfo);
		}
// article 객체에 이미지 파일 정보도 저장해준다 (배열 형태)
		article.setFileInfos(fileInfos);

// Service 단으로 데이터 전송하고 성공 여부는 int로 받는다.
		int cnt = service.postBoard(article);
		return cnt;
	}
```

이슈 정리

1. ‘files’를 찾지 못한다

   ⇒ @RequestPart(value = "files", required = false) `required = false` 를 추가해주니 해결

2. 상대 경로 문제

   ```
   java.io.IOException: java.io.FileNotFoundException: /private/var/folders/c3/hxgrbq710ndfsnm459mczt1c0000gn/T/tomcat.80.2385627806756500432/work/Tomcat/localhost/ROOT/src/main/resources/static/imgs/a14d2d56-c734-40f0-9c06-6d30cf39b48b.png (No such file or directory)
   ```

   스프링 부트 내부의 폴더에 저장하기 위해 상대 경로로 static 폴더에 접근해보려 했으나 경로를 찾지 못하고 에러가 발생했다.

   찾아보니 프로젝트 외부에 절대 경로를 사용하여 경로를 지정해주어야 한다고 한다…

3. 위의 경로 문제로 알게 된 다른 사실

   ```java
   mfile.transferTo(new File(folder,saveFileName));

   FileCopyUtils.copy(mfile.getInputStream(), new FileOutputStream(Paths.get(saveFileName).toFile()));
   ```

   둘 다 된다

#### Article (Dto) 참고하기 \_ 수정함

```java
public class Article {

	private int articleNo;
	private String title;
	private String id;
	private String content;
	private String regTime;
	private List<FileInfo> fileInfos;   // 파일 저장 위해서 기존 필드에 추가된 부분

	public Article() {
		super();
	}
	public Article(int articleNo, String title, String id, String content, String regTime, List<FileInfo> fileInfos) {
		super();
		this.articleNo = articleNo;
		this.title = title;
		this.id = id;
		this.content = content;
		this.regTime = regTime;
		this.fileInfos = fileInfos;      // 파일 저장 위해서 기존 필드에 추가된 부분
	}
```

#### 4. Service 단 구현

ArticleService

```java
...
int postBoard(Article article) throws Exception;
...
```

ArticleServiceImpl

```java
...
@Override
	@Transactional
	public int postBoard(Article article) throws Exception {
		List<FileInfo> file = article.getFileInfos();
		if (file != null && !file.isEmpty()) {
			for (int i = 0; i < file.size(); i++) {
				String fileName = file.get(i).getOriginFile();
				System.out.println("Uploaded file name: " + fileName);
			// 프린트 : 스크린샷 2023-05-17 오후 10.00.26.png   b8c1a584-72fa-4bac-b0d7-be92b2194432.png
			}
			// 게시글 작성하는 매퍼 and 이미지 저장하는 매퍼 동시에 article을 보내주어 처리한다. 결과물은 and 연산으로 둘 다 0 아니면 성공 처리하게 구현했다.
			return articleMapper.postBoard(article) & articleMapper.fileRegister(article);
		}
		return 0;
	}
...
```

#### 5. Mapper 단 구현

article.xml

```xml
...

	<insert id="postBoard">
		insert into board (id, title, content)
		values (#{id}, #{title}, #{content})
		<selectKey resultType="int" keyProperty="articleNo" order="AFTER">
		SELECT LAST_INSERT_ID()
		</selectKey>
	</insert>

	<insert id="fileRegister" parameterType="Article">
		insert into file_info (article_no, save_folder, original_file, save_file)
		values
		<foreach collection="fileInfos" item="fileinfo" separator=" , ">
			(#{articleNo}, #{fileinfo.saveFolder}, #{fileinfo.originFile}, #{fileinfo.saveFile})
		</foreach>
	</insert>

...
```

`SELECT LAST_INSERT_ID()` : 게시글 등록하면서 자동 생성된 auto increment 값을 받아와서 이미지 저장할 때 article_No에 값을 저장한다.

위의 게시글 명령 후 아직 커밋? 이 안된 상태이므로 정보를 가져와서 파일 업로드에 사용할 수 있다.

#### 6. MySQL 단 구현

```sql
use enjoytrips;
drop table `file_info`;
CREATE TABLE `file_info` (
  `article_no` int NOT NULL,
  `save_folder` varchar(100) DEFAULT NULL,
  `original_file` varchar(100) DEFAULT NULL,
  `save_file` varchar(100) DEFAULT NULL
  );
```

이미지 저장을 위한 테이블 따로 생성

![](https://velog.velcdn.com/images/hvvany/post/1def995b-b582-473a-a011-05d4b036f9d1/image.png)

### 3. swiper swipe 이슈

`cityInfoSwiper`에서 발생

props로 넘어오는 (or vuex로 가져온) 데이터가 전부 저장되기 전에 swiper가 형성되어서 다음 슬라이드로 넘어가지지 않았다.

vue의 `양방향 바인딩`을 이용하여 swiper-slide로 사용하는 weather의 크기를 이용해 다음과 같은 옵션을 추가하였다.

`:key="weather.length”`

length가 증가할 때마다 swiper가 다시 구성요소를 렌더링하고 새 인스턴스를 생성하며 swiper를 다시 로드한다.

## 프로젝트 후기

- **김준환** : 1학기 과정을 통해 배운 내용을 직접 서비스를 구현하며 부딪힐 수 있는 좋은 경험이었습니다.
  자바를 처음 배우며 힘든 점도 많았지만 이제 spring boot로 백엔드 서버를 구축하고 vue로 SPA를 제작하는 수준까지 성장할 수 있었습니다. 좋은 교수님과 동기들 덕분에 큰 성장을 이루었습니다. 감사합니다 :)

- **강다은** : 실습을 통해서 배운 내용을 바로 적용하며 웹 개발에 대한 이해도를 높일 수 있었습니다.
  프론트엔드와 백엔드 전부 내 손을 거쳤다는 생각에 자신감을 끌어 올려 줬습니다.
  마지막으로 갈수록 잘 만들고 싶다는
  생각이 강해져서 점점 의욕이 생겼는데 끝까지 노력해준 페어님께 감사의 인사를… (꾸벅)
