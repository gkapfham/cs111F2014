Steps for Using Git in CMPSC 111 Fall 2014

Faculty and Students:

git config --global user.name "Gregory M. Kapfhammer"
git config --glocal user.email "gkapfham@allegheny.edu"

Open a terminal window and type the following command

ssh-keygen

Follow prompts to create keys and save them in the default directory

cd .ssh
ls
vim id_rsa.pub

Go to bitbucket.org and create an account. Make sure to use your allegheny.edu email address.

Go to the settings for your account and find the section for ssh keys.

Return to your terminal window and highlight and copy all of the key.  Make sure that you do not select any white space.

Return to the web site where you are viewing the bitbucket.org  Web site.

Paste in the public key that you have highlighted and upload it.  If no errors occur then this upload worked correctly.

Faculty:

mkdir cs111F2014-trial
cd cs111F2014-trial
git init .
mkdir labs
cd labs
mkdir lab1
cd lab1
cd ../
cd ../
vim README.md
git add README.md
git commit README.md

Create the repository in bitbucket with the same name as the directory that you just created

git remote add origin git@bitbucket.org:gkapfham/cs111f2014-trial.git
git push -u origin --all
git push -u origin --tags

Check to make sure that the README.md file is now available in the repository.

Students:

Using bitbucket, create a new private repository with the name cs111f2014-<your user name>

Add the CMPSC 111 professors so that they have administrator privileges for the repository.
Go into the settings panel and then click access management.

mkdir cs111F2014
cd cs111F2014
git clone git@bitbucket.org:gkapfham/cs111f2014-trial.git
cs cs111F2014-trial 

git remote add cs111 https://gkapfham-test@bitbucket.org/gkapfham-test/cs111f2014-gkapfhamtest.git 
git push -u cs111 master

Faculty:

git remote add gkapfham https://gkapfham-test@bitbucket.org/gkapfham-test/cs111f2014-gkapfhamtest.git

Continue running these commands for all of the students in the class.
You should get an email for each of the repositories once a student shares it with you.

Make sure that you have all of the students:

git remote -v

Check to see if the students pushed:

git fetch --all

(Does a faculty member have to log in as the student? Did once, did not second time).

Start working on the first lab assignment.

git checkout -b lab1 master
vim cs111F2014-lab1.txt
git add cs111F2014-lab1.txt
git commit -a
git push origin lab1

Students:

git fetch origin
git checkout -b lab1 origin/lab1

cd labs
cd lab1
more cs111F2014-lab1.txt
vim HelloWorld.java
javac HelloWorld.java
java HelloWorld

Please make sure that you put your name in a comment of your file!

git add HelloWorld.java
git commit HelloWorld.java
git push cs111 lab1

Faculty:

git fetch --all

Go back to the root directory of the repository.

git checkout master
git branch -D lab1
git checkout -b lab1 gkapfham/lab1

cd labs/lab1
more HelloWorld.java

Repeat the following steps for all of the students who are in the class.




