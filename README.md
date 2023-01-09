# Send Email App
## _Fun ways to send email from an App that doesn't have DB_

We designed this app for Fun, To send emails to our Loved ones from a Linux Server or Local PC using your credentials.

## Features

- Deploy a Jar file.
- Input your own credentials for Gmail.
- Emails will be sent on Port 587 with TLS by default.
- You can include Emojis 👽 in the Email too. Copy your favorite from [GetEmoji](https://getemoji.com/).

## Dependencies

- Java 11 or 17
- maven 3.6.3 or above

## Create Jar File for the application
Clone the repo on to your target system

```sh
cd email-notification-app/
mvn clean package
```

## Run the Application by Yourself...

```sh
java -jar target/SendEmail-*-SNAPSHOT.jar
```

Verify the deployment by navigating to your server address in your preferred browser.

```sh
http://<Insert_Your_server_Public_IP_here>:8080
```
If you are running it on local machine
```sh
127.0.0.1:8000
```

## Grab Your SMTP Credentials

SMTP Server for your Gmail
- Gmail SMTP server address: smtp.gmail.com
- Gmail SMTP name: Your full name
- Gmail SMTP username: Your full Gmail address (e.g. you@gmail.com)
- Gmail SMTP password: The password that you use to log in to Gmail

Learn more about Sending limits from your gmail on [Google Support Page](https://support.google.com/mail/answer/22839?hl=en)

# Test the App and .........

![Alt Text](https://media0.giphy.com/media/3o6UBfwmyyFM9ieUgM/giphy.gif?cid=ecf05e470fo8sqbs9cswci5hk8xv4062afqof5s1riuions1&rid=giphy.gif&ct=g)

## Contributing guidelines

We’d love for you to help us improve this project. To help us keep this collection
high quality, we request that contributions adhere to the following guidelines.

Here’s how we suggest you go about proposing a change to this project:

1. [Fork this project][fork] to your account.
2. [Create a branch][branch] for the change you intend to make.
3. Make your changes to your fork.
4. [Send a pull request][pr] from your fork’s branch to our `main` branch.

Using the web-based interface to make changes is fine too, and will help you
by automatically forking the project and prompting to send a pull request too.

[fork]: https://help.github.com/articles/fork-a-repo/
[branch]: https://help.github.com/articles/creating-and-deleting-branches-within-your-repository
[pr]: https://help.github.com/articles/using-pull-requests/

## We are newbies to Git, yes we do mistakes.
ooh, That password is already rotated. 
![Alt Text](https://media3.giphy.com/media/88iYsvbegSUn9bSTF8/200w.webp?cid=ecf05e47dsov9y8wwvo0ploy3bjp5dnnrqnru1g50kdr43an&rid=200w.webp&ct=g)