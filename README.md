# EndecryptUtil
[![GitHub release](https://img.shields.io/github/release/whvcse/EndecryptUtil.svg)]()
[![GitHub Release Date](https://img.shields.io/github/release-date/whvcse/EndecryptUtil.svg)]()
[![JitPack](https://img.shields.io/jitpack/v/whvcse/EndecryptUtil.svg)]()
[![author](https://img.shields.io/badge/author-wangfan-ff69b4.svg)]()

## 简介
Java、Android(安卓)加密解密工具类，不依赖于其他库。

[查看 EndecryptUtil.java 源码](https://github.com/chenshouw/EndecryptUtil/blob/master/src/main/java/com/wangfan/endecrypt/utils/EndecryptUtils.java)

## 导入
#### gradle方式的引入
需要先在project的build.gradle下添加：
```java
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
```java
dependencies {
    compile 'com.github.whvcse:EndecryptUtil:1.0.4'
}
```
#### maven方式引入
```java
<repositories>
    <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.whvcse</groupId>
    <artifactId>EndecryptUtil</artifactId>
    <version>1.0.4</version>
</dependency>
```
#### jar包下载


## 用法
#### 1.字符串转base64编码
```java
String str = "Hello Word!";
String rs = EndecryptUtils.encrytBase64(str);
```
#### 2.base64编码转字符串
```java
String str = "SGVsbG8gV29yZCE=";
String rs = EndecryptUtils.decryptBase64(str);
```


#### 3.字符串转16进制
```java
String str = "Hello Word!";
String rs = EndecryptUtils.encrytHex(str);
```
#### 4.16进制转字符串
```java
String str = "48656c6c6f20576f726421";
String rs = EndecryptUtils.decryptHex(str);
```


#### 5.AES加密
```java
String str = "Hello Word!";
Key key = EndecryptUtils.generateKey("wangfan");
String rs = EndecryptUtils.encrytAes(str, key);
```
#### 6.AES解密
```java
String str = "2c700dadcc66726f1665a4d604f6e6a4f8a498bc0173ed5f49f063b8f1a74f7e";
Key key = EndecryptUtils.generateKey("wangfan");
String rs = EndecryptUtils.decryptAes(str, key);
```


#### 7.Md5加密
```java
String str = "Hello Word!";
String rs = EndecryptUtils.encrytMd5(str);
```
#### 8.Md5加盐加密
```java
String str = "Hello Word!";
String salt = "wangfan";  //盐
int hashIterations = 3;  //散列次数,把密文再进行3次Md5加密
String rs = EndecryptUtils.encrytMd5(str, salt, hashIterations);
```
 
