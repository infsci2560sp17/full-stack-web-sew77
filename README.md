# NBA OldFashion

1. What is the proposed name for your Web application?
    - Old NBA
2. Who is the target audience for your Web application?
    - The international students in U.S who love NBA and their ages are between 23 and 35. 
3. What problem is it intended to solve for the target audience?
    - There’re thousands international students in U.S who are NBA fans, especially the students age between 23 and 35. They watched NBA in their home countries when they were children. Now, these students grow up and study in the United States. Although there are many NBA games can be watched now, they still want to watch some videos and photos of old NBA games to reactive their childhood memory and enjoy it. However, it is not easy to find the web or resource that includes systemic old NBA videos and photos. I’ll provide the systemic links, photos and sharing board.
4. How will it meet the minimum project requirements?
    - My site will use the freemium model. All the content will be freely watched online and some of content will be charged for downloading according to the copyright. If users want to write comments, a site account will be required for login. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
    - My site will customize the content based on the comments and reviews from the users. The added content will be the wishful for the most users. Also, I’ll absorb the resource that submitted by users who want to share what they like. Meanwhile, there is no website that provide the old fashion NBA game. 

## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-sew77.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-sew77)

## Changelog

[Changelog](CHANGELOG.md)

## Web Site
    
[OldNBA](https://guarded-fjord-82474.herokuapp.com)



## Key Features

* Users need password to login 
* Directory main page
* Adding options by userself
* User can share his or her own likes

## Project Details

### Landing Page

In the welcome page(landing page), there is a "come" for users clicking. In order to get the resource, users need to login.
After login, there are 4 options in main page that users can click and to the page that users like. Also, user can depends on the picture
which shows the contend in next page to make decission. Last option is a part for users sharing their loves. 
![](/src/main/Landing.JPG)



### User Input Form

Users can add their own likes by choosing the player and entering the link of video. After finish typing the information,
users can uplaod the information to database and it will show on the table above. 
![](/src/main/Slam.JPG)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
