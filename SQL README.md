# PENTAGON SPACE

## SQL session

### DBMS (Database Management System):

*   It is a software that maintains and manages database
    
*   Provides two important features security and authorization(verification)
    
*   The data in DBMS will be stored in the form of files
    
*   To communicate with the DBMS software, we need to make of use language called query language.
    

### Types of DBMS

*   Network DBMS
    
*   Object Oriented DBMS
    
*   Hierarchal DBMS
    
*   RDBMS
    

#### Network DBMS:

*   The data is stored in the form of network
    
*   Data can be shared from one network to another network
    
*   It is very much difficult to find the source of the data
    
*   Less secure, more cost
    

#### Object Oriented DBMS \[OODBMS\]

*   Consumes more space
    
*   stores data in form of object
    
*   can’t establish connection
    

#### Hierarchical DBMS

*   Storing data in hierarchical format
    
*   Here in hierarchical data one data is there inside another data like one in file there is another data, but in companies there is huge data here it is very difficult for the companies to use hierarchical data
    
*   It is not an efficient manner of storing data
    
*   Can’t relate the data
    

#### RDBMS (Relational Database management System)

*   It is the software to store the data in the form of tables
    
*   If the DBMS follows relational model then we call it as RDBMS
    
*   If DBMS follows EF CODD rules it is RDBMS
    
*   To communicate with RDBMS, we use structured query language (SQL)
    

#### Relational Model

*   Relational model was introduced by E.F CODD
    
*   In relational model data will be stored in the form of tables/relations
    
*   In Relational model we can store meta-data
    
*   Meta-data : It is data about the data
    

### Difference between DBMS and RDBMS

| DBMS | RDBMS |
| --- | --- |
| DBMS is a software which maintains and manages the database | RDBMS is a software which is used to store the data in the form of tables /relations |
| DBMS stores data in the form of files | RDBMS stores the data in the form of tables/relations |
| To communicate with DBMS, we use query language | To communicate with DBMS, we use structured query language |
| Supports single user access | Supports multi user access |
| Normalization cannot be performed | We can perform Normalization |
| Less Secured | More Secured |
| Ex: Microsoft access | Ex: Oracle, My SQL |
|  |  |

Data is a raw fact which describes the attribute of the entity

---


### EF CODD Rules

1.  The data enter into the database should be single value or atomic.
    
2.  We can store in multiple tables and can establish the connection between those tables by using key attribute.
    
3.  We can assign datatypes and constraints to validate the data to enter into the table, datatypes are mandatory whereas constraints are optional.
    

#### Difference between RDBMS and Excel Sheet ( Spread Sheet )

| Aspect | RDBMS (Relational Database Management System) | Excel Sheet (Spreadsheet) |
| --- | --- | --- |
| Purpose | Designed to store and manage structured data efficiently | Used for simple data entry, calculations, and analysis |
| Data Storage | Stores data in related tables with defined schema | Stores data in cells arranged in rows and columns |
| Data Relationships | Supports complex relationships (primary/foreign keys) | Does not support relational integrity between sheets |
| Data Volume Handling | Efficiently handles large volumes of data | Limited handling of large datasets |
| Multi-user Support | Supports concurrent access by multiple users | Limited or no real-time multi-user support |
| Data Integrity | Enforces strict data types and constraints | Minimal data validation and enforcement |
| Querying | Uses SQL for complex queries and operations | Uses simple functions and filters |
| Security | Advanced user roles and access control | Basic password protection |
| Scalability | Highly scalable for enterprise applications | Not suitable for large-scale applications |
|  |  |  |

---

## Data Types

Before storing any data into the memory location, we have to specify the type of data to specify the type of data we use data types. Data types and constraints are used to validate the data.

### Types of Data Types

*   CHAR
    
*   VARCHAR
    
*   LARGE OBJECTS (LOB)
    
*   CHARACTER LARGE OBJECT (CLOB)
    
*   BINARY LARGE OBJECT (BLOB)
    
*   DATA
    
*   NUMBER
    

#### CHAR

*   It is used to store characters
    
*   Allows upper case, lower case, special character, ‘0-9’
    
*   Char datatype is also called as fixed length memory location
    
*   The max capacity is 2000 for char.
    
*   Char data type size as an argument
    
*   In case of char the unused memory cannot be given back to the memory location for reuse purpose
    
*   Hence there is a wastage of memory.
    

#### VARCHAR

*   It is used to store characters.
    
*   Allows upper case, lower case, special character, ‘0-9’.
    
*   Takes size as an argument.
    
*   Varchar is called as variable length memory location.
    
*   The max capacity is 2000 for varchar.
    
*   Unused memory will be given back to memory location for reuse purpose.
    
*   No wastage of memory
    

#### VARCHAR 2

*   It is an updated version of varchar
    
*   It stores maximum character up to 4000
    

#### LARGE OBJECTS (LOB)

###### CHARACTER LARGE OBJECT (CLOB)

*   It is used to store large amount of characters up to 4GB
    
*   **Syntax:** `Clob;`
    

###### BINARY LARGE OBJECT (BLOB)

*   It is used to store the binary objects such as audio, video, image, document, pdf in the form of binary format.
    
*   **Syntax:** `Blob;`
    

#### DATE

*   It is used to store the date
    

#### NUMBER

*   It is used to store numbers
    
*   **Syntax:** `NUMBER (precision, [scale]);` the scale is optional
    
*   **Precision:** used to store integer value (numeric non - decimal value)
    
*   **Scale:** It is used to store decimal values

---
    

## CONSTRAINTS

It is a rule or condition given to a table to validate the data.

### Types of Constraints

*   UNIQUE Constraint
    
*   NOT NULL Constraint
    
*   CHECK Constraint
    
*   PRIMARY KEY Constraint
    
*   FOREIGN KEY Constraint
    

#### UNIQUE Constraint

*   Unique Constraint is used to avoid duplicate values entered into a table
    
*   **Note:** Null means Empty, Null is a keyword not a constraint.
    

#### NOT NULL Constraint

*   It is used to avoid duplicate values which are entered into a table
    

#### CHECK Constraint

*   It is used to provide user defined condition
    
*   **Syntax:**
    
    SQL
    
        CHECK (condition) 
    
*   **Example:** `CHECK (Sal >= 100)`
    
*   `CHECK (perc >= 0 && per<=100)`
    

#### PRIMARY KEY Constraint

*   It is used to uniquely identify records from the table
    
*   **Characteristics of Primary key**
    
    *   To represent the table among the scheme we use primary key
        
    *   Primary key must be a combination unique and not null
        
    *   A table can have only one primary key as per the database standards
        
    *   Primary key is not mandatory for a table, but design wise it is referable
        

#### FOREIGN KEY Constraint

*   Foreign key is used to establish the connection between two tables
    
*   **Characteristics of Foreign key**
    
    *   A table can have multiple foreign key
        
    *   A primary key of a table can be eligible to foreign key of another table
        
    *   Foreign key can be null and can accept duplicate values, and also it can be unique and not null but nothing is mandatory.
        
    *   Foreign key is also known as Referential Integrity Constraint
        
    *   Foreign key is present in child table but always belongs to parent table
        
    *   Foreign key is not mandatory for a table, but design wise it is referable
    
---


## SQL Statements

*  **Data Definition Language (DDL)**

    *   CREATE
        
    *   RENAME
        
    *   ALTER
        
    *   TRUNCATE
        
    *   DROP
        
*   **Data Manipulation Language (DML)**
    
    *   INSERT
        
    *   UPDATE
        
    *   DELETE
        
*   **Data Control Language (DCL)**
    
    *   GRANT
        
    *   REVOKE
        
*   **Transaction Control Language (TCL)**
    
    *   COMMIT
        
    *   ROLL BACK
        
    *   SAVE POINT
        
*   **Data Query Language (DQL)**
    
    *   SELECT
        
        *   PROJECTION
            
        *   SELECTION
            
        *   JOINS
            

Data Query Language (DQL)

*   **SELECT:**
    
    *   It is used to retrieve data and display the output
        
*   **PROJECTION:**
    
    *   It is used to retrieve data from the given table by selecting column name
        
    *   By default, in projection all records get selected
        
*   **SELECTION:**
    
    *   It is used to retrieve the data from the table by selecting column name and by providing condition
        
*   **JOINS:**
    
    *   It is used to retrieve the data from multiple tables simultaneously
        

FROM CLAUSE:

*   In the query from class executes first
    

SELECT CLAUSE:

*   It is used to retrieve the data
    
---

Number format Datatype

*   **Int:** To store integer values
    
*   **Big int:** To store large number of integer value data
    
*   **Decimal:** To store both integer and decimal value.

---

Data Format Data type

*   **DATE:** To store data values
    
    *   MY SQL FORMAT: ‘YYYY – MM – DD’
        
*   **DATETIME:** To store data along with time
    
    *   MYSQL FORMAT : ‘YYYY – MM – DD HH:MI:SS ’
        
*   **TIME:** To store Time values
    
    *   MYSQL FORMAT : ‘ HH : MI : SS ’
        
*   **TIMESTAMP:** To store date, time along Timezone
    
    *   MYSQL FORMAT: ‘YYYY – MM – DD HH:MI:SS UTC ’
        
    *   UTC : Co-ordinated universal Time

    ---

CONSTRAINTS

*   **AUTO\_INCREMENT:** To generate unique value for a column automatically
    
    *   Default is 1
        
    *   Only for primary key column we can use auto\_increment
        
*   **ENUM:** It act as a datatype, to set some limited set of values we use enum
    
*   **Default:** To set a default value for a column we use default
    

### Steps to install My SQL:

1.  open chrome
    
2.  search for my sql download
    
3.  you will get interface
    
4.  open the first link
    
5.  Scroll down we have my sql community downloads
    
6.  No thanks, just start my download
    
7.  For windows here we have my sql installer for windows, click on it
    
8.  Next click on the first download option
    
9.  Click on the file you downloaded
    
10.  Click yes, then next
    
11.  Use custom, click on first option (my sql server my sql servermy sql 8.0then select first option), next open application (choose my sql work bench my sql workbench 8.0select the first option)
    
12.  Then click next
    
13.  If we forget my sql password uninstall and install.
    

### Keywords

*   **Signed:** It will allow both positive and negative numbers for a column
    
*   **Unsigned:** It will allow only positive numbers for a column
    
*   If we don’t use these keywords by default, it is signed keyword.
    

## SQL STATEMENTS

### Data Definition Language (DDL)

**CREATE:**

It is use to create a database and its objects such as table, view, procedure, Trigger and User.

*   **To create a database, syntax:** `create database database_name;`
    
*   **To view all databases, present in my SQL, syntax:** `show databases;`
    
*   **To access one database, syntax:** `use database_name;`
    
*   **To create a table, SYNTAX:1**
    
    SQL
    
        CREATE TABLE TABLE_NAME
        (COLUMN_NAME_1 DATATYPE SIGNED/UNSIGNED NULL/NOT NULL,
        COLUMN_NAME_2 DATATYPE SIGNED/UNSIGNED NULL/NOT NULL,
        ...,
        ...,
        COLUMN_NAME_N DATATYPE SIGNED/UNSIGNED NULL/NOT NULL,
        CONSTRAINT CONSTRAINT_NAME PRIMARY KEY(COLUMN_NAME),
        CONSTRAINT CONSTRAINT_NAME UNIQUE(COLUMN_NAME),
        CONSTRAINT CONSTRAINT_NAME CHECK(CONDITION),
        CONSTRAINT CONSTRAINT_NAME FOREIGN KEY(COLUMN_NAME)REFERENCES PARENT_TABLE_NAME(COLUMN_NAME)
        );
    
*   **Example:**
    
    SQL
    
        CREATE TABLE STUDENT
        (SID INT UNSIGNED NOT NULL,
        SNAME VARCHAR(10) NOT NULL,
        PHONE INT UNSIGNED NOT NULL,
        CONSTRAINT P_SID PRIMARY KEY(SID),
        CONSTRAINT U_PH UNIQUE(PHONE),
        CONSTRAINT C_PH CHECK(LENGTH(PHONE)=10)
        );
    SQL
    
        CREATE TABLE BRANCH
        (BID INT UNSIGNED NOT NULL,
        BNAME VARCHAR(10) NOT NULL,
        LOCATION VARCHAR(20) NOT NULL,
        PINCODE INT UNSIGNED NOT NULL,
        CONSTRAINT P_BID PRIMARY KEY(BID),
        CONSTRAINT U_PIN UNIQUE(PINCODE),
        CONSTRAINT C_PIN CHECK(LENGTH(PINCODE)=6)
        );
    
*   **SYNTAX:2 TO CREATE TABLE:**
    
    SQL
    
        CREATE TABLE TABLE_NAME
        (
        COLUMN_NAME_1 DATATYPE SIGNED/UNSIGNED NULL/NOT NULL CONSTRAINT,
        COLUMN_NAME_2 DATATYPE SIGNED/UNSIGNED NULL/NOT NULL CONSTRAINT,
        ...,
        COLUMN_NAME_N DATATYPE SIGNED/UNSIGNED NULL/NOT NULL CONSTRAINT,
        CONSTRAINT FOREIGN KEY(COLUMN_NAME)REFERENCES PARENT_TABLE_NAME(COLUMN_NAME)
        );
    
*   **Example:**
    
    SQL
    
        CREATE TABLE FACULTY
        (
        FID INT UNSIGNED NOT NULL PRIMARY KEY,
        FNAME VARCHAR(10) NOT NULL,
        SUBJECT VARCHAR(10) NOT NULL,
        DNAME VARCHAR(10),
        PHONE INT UNSIGNED NOT NULL UNIQUE,CHECK(LENGTH(PHONE)=10)
        );
    SQL
    
        CREATE TABLE CUSTOMER
        (
        CID INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
        CNAME VARCHAR(10) NOT NULL,
        AGE INT UNSIGNED NOT NULL,
        ORDER_ID INT UNSIGNED,
        CITY VARCHAR(10) NOT NULL,
        BALANCE DECIMAL(10,2) UNSIGNED NOT NULL DEFAULT'100.00',
        SID INT UNSIGNED,
        CONSTRAINT FOREIGN KEY(SID)REFERENCES STUDENT(SID)
        );
    SQL
    
        CREATE TABLE BANK
        (ACCOUNT_NUMBER BIGINT NOT NULL PRIMARY KEY,
        ACCOUNT_HOLDER_NAME VARCHAR(20) NOT NULL,
        GENDER ENUM('MALE','FEMALE') NOT NULL,
        BALANCE DECIMAL(7,2) NOT NULL DEFAULT'500.00',
        IFSC_CODE VARCHAR(20) NOT NULL CHECK(LENGTH(IFSC_CODE)=11),
        BID INT UNSIGNED,
        CONSTRAINT FOREIGN KEY(BID)REFERENCES BRANCH(BID)
        );
    
*   **To view structure of the table, syntax:** `Desc table_name;`
    
*   **To clear screen in my SQL, syntax:** `system cls`
    
*   **To Exit from my SQL server, syntax:** `EXIT`
    
*   **To view constraint name of the constraints**
    
    1.  **Step1:** `Use information_schema;`
        
    2.  **Step2:** `Select * from table_constraints;`
        

**ALTER:**

It is used to modify the structure of the table

*   **To add a new column:**
    
    *   **Syntax:**
        
        SQL
        
            alter table table_name
            add column_name datatype null/not null; 
        
    *   **Example:**
        
        *   `Email varchar (10) not null --- student`
            
        
        SQL
        
            alter table student
            add email varchar (20) not null; 
        
*   **To add a column after a particular column:**
    
    *   **Syntax:**
        
        SQL
        
            alter table table_name
            add column_name datatype null/not null after column_name; 
        
    *   **Example:**
        
        *   `Balance int null after sname---student`
            
        
        SQL
        
            alter table student
            add balance int null after sname; 
        
*   **To drop column\_name:**
    
    *   **Syntax:**
        
        SQL
        
            alter table table_name
            drop column_name; 
        
    *   **Example:**
        
        *   `ifsc_code ---- bank`
            
        
        SQL
        
            alter table bank
            drop ifsc_code; 
        
*   **To change the datatype:**
    
    *   **Syntax:**
        
        SQL
        
            alter table table_name
            modify existing_column_name new_datatype null/not null; 
        
    *   **Example:**
        
        *   Change dname datatype in faculty table from varchar to char
            
        
        SQL
        
            alter table faculty
            modify dname char (20) null; 
        
*   **To change null/not null:**
    
    *   **Syntax:**
        
        SQL
        
            alter table table_name
            modify existing_column_name existing_datatype null/not null; 
        
*   **To change table\_name:**
    
    *   **Syntax:**
        
        SQL
        
            alter table table_name
            rename new_table_name; 
        
    *   **Example:**
        
        *   `Student---student_data`
            
        
        SQL
        
            alter table student
            rename student_data;
        
*   **To change column\_name**
    
    *   **Syntax:**
        
        SQL
        
            alter table table_name
            change existing_column_name new_column_name existing datatype null/not null; 
        
    *   **Example:**
        
        SQL
        
            alter table faculty
            change fname name varchar(20) not null; 
        
*   We cannot drop/rename a column which is assigned with check constraint
    
*   **To add constraints:**
    
    *   **To add primary key:**
        
        *   **Syntax:**
            
            SQL
            
                alter table table_name
                add constraint primary key(column_name); 
            
    *   **To add unique:**
        
        *   **Syntax:**
            
            SQL
            
                alter table table_name
                add constraint unique(column_name); 
            
        *   **Example:**
            
            SQL
            
                alter table branch
                add constraint unique(location); 
            
    *   **To add check constraint:**
        
        *   **Syntax:**
            
            SQL
            
                alter table table_name
                add constraint check(condition); 
            
    *   **To add foreign key:**
        
        *   **Syntax:**
            
            SQL
            
                alter table table_name
                add constraint foreign key(column_name)references parent_table_name(column_name);
            
    *   **To add default constraint for existing column:**
        
        *   **Syntax:**
            
            SQL
            
                alter table table_name
                modify existing_column_name existing_datatype null/not null default‘default_value’; 
            
        *   **Example:**
            
            SQL
            
                alter table product
                modify quantity int unsigned not null default'100'; 
            
    *   **To add default constraint for new column:**
        
        *   **Syntax:**
            
            SQL
            
                alter table table_name
                add column_name datatype null/not null default‘default_value’; 
            
        *   **Example:**
            
            SQL
            
                alter table faculty
                add balance int not null default'100'; 
            
    *   **To add auto\_increment for existing column**
        
        *   **Syntax:**
            
            SQL
            
                alter table table_name
                Modify existing_column_name existing datatype null/not null auto_increment; 
            
        *   **Example:**
            
            SQL
            
                alter table product
                modify pid int unsigned not null auto_increment; 
            
    *   **To add auto\_increment for a new column:**
        
        *   **Syntax:**
            
            SQL
            
                alter table table_name
                add column_name datatype null/not null primary key auto_increment; 
            
*   **To Drop constraints:**
    
    *   **To drop primary key:**
        
        *   **Syntax:**
            
            SQL
            
                alter table table_name
                drop primary key; [cite: 321, 322]
            
        *   we can’t drop primary key from a table if primary is acting as a foreign key in another table
            
        *   we can’t drop primary key from a table if a primary key column is assigned with auto\_increment
            
    *   **To drop default**
        
        *   **Syntax:**
            
            SQL
            
                alter table table_name
                alter column column_name
                drop default; 
            
        *   **Example:**
            
            SQL
            
                alter table faculty
                alter balance
                drop default; 
            
    *   **To drop auto\_increment:**
        
        *   **Syntax:**
            
            SQL
            
                alter table table_name
                modify existing column_name existing datatype null/not null ; 
            
        *   If we don’t pass auto increment automatically auto increment is removed
            
        *   **Example:**
            
            SQL
            
                alter table customer
                modify cid int unsigned not null; 
            
    *   **To drop other constraints (unique, check, foreign key)**
        
        *   **Syntax:**
            
            SQL
            
                Alter table table_name
                Drop constraint constraint_name;
            

**RENAME**

**TRUNCATE:**

It is used to delete all the records from a table without affecting the structure of a table.

*   **Syntax:**
    
    SQL
    
        truncate table table_name; 
    
*   **Example:**
    
    SQL
    
        truncate table product; 
    

**DROP:**

It is used to drop database and its objects such as table, view, procedure, trigger and user from MySQL

*   **Syntax:**
    
    SQL
    
        drop table table_name; 
    
*   **To drop database from MySQL**
    
    *   **Syntax:**
        
        SQL
        
            drop database database_name; 
        
    *   **Example:**
        
        SQL
        
            drop database demo; 
        

## Data Manipulation Language (DML)

### INSERT:

It is used to insert/add records into existing tables

*   **Syntax 1 (when we know column name along with column order from the table)**
    
    SQL
    
        insert into table_name values (v1, v2, …..., vn); 
    *   **Example:**
        
        SQL
        
            insert product values(1,'iphone',45000,1); 
        
*   **Syntax 2(if we know column name):**
    
    SQL
    
        Insert into table_name (col1, col2, ……., coln) values (v1, v2, ……, vn); 
    *   **Example:**
        
        SQL
        
            insert into product (pname, pid, price, quantity) values ('kitkat',7,20,5), ('munch',8,20,5); 
        
*   **Syntax 3:**
    
    SQL
    
        insert into table_name (select statement);
    

### UPDATE

It is used to modify the existing records in a table

*   **Syntax:**
    
    SQL
    
        update table_name
        set column_name_1=v1, column_name_2=v2,……, column_name_n=vn
        [where condition]; 
    
*   **Example:**
    
    SQL
    
        update product
        set pname='kabab', price=150
        where pid=5; 
    

### DELETE

It is use to delete existing from a table

*   **Syntax:**
    
    SQL
    
        delete
        from table_name
        [where condition]; 
    
*   **Example:**
    
    SQL
    
        delete
        from product
        where pid=9;
    
*   **write a query to display employee fname and lname from employees table**
    
    SQL
    
        select fname, lname from emps; 
    
*   **write a query to display employee and dob along with their status**
    
    SQL
    
        select doj, dob, status from emps; 
    
*   **write a query to display details of employees from emps table**
    
    SQL
    
        select * from emps;
    *   **note:** we use \* to select all the columns from the given table
        
*   **write a query to display emp fname, lname, gender and salary from emps table**
    
    SQL
    
        select fname, lname, gender, sal from emps; 
    
---

## Expression:

*   Anything which gives an output will be known as Expression
    
*   It is a combination of operators and operands
    
*   **Example:** 10 + 20 = 30, Here +, = are operators and 10, 20, 30 are operands
    
*   **Operands:** The values present in the Expression will be known as operands
    
    *   Direct Value
        
    *   Immediate value
        
*   **write a query to display details of employee along with annual salary**
    
    SQL
    
        select *, sal*12 from emps; 
    
*   **write a query to display fname, lname, dob and sal with 20,000 bonus**
    
    SQL
    
        select fname, lname, dob, sal+20000 from emps; 
    
*   **wqtd fname, gender and sal with 10% hike**
    
    *   **hike formula:** `column_name +(column_name * %hike/100)`
        
    
    SQL
    
        select fname, gender, sal+(sal*10/100) as 'hike' from emps; 
    
*   **wqtd fname, job and salary with 5% hike and annual salary with 8% hike**
    
    SQL
    
        select fname, job, sal+(sal*5/100), (sal*12) +((sal*12) * 8/100) from emps; 
    
*   **wqtd employee fname,lname,job and commission with 10% deduction**
    
*   **wqtd employee fname, job, sal with 15% deduction and annual salary with 11% hike**
    
    SQL
    
        select fname ,job,sal-(sal*15/100),(sal*12)+((sal*12)*11/100) from emps; 
    
---

## Aliasing:

It is used to provide alternative name for a column in resultant table

*   **Rules:**
    
    *   With or without using a keyword we can use write alias name.
        
    *   We can use multiple words as alias name by using inside quotes or by connecting it with underscore
        
*   **Example:** `select sal as salary;`
    
*   `select sal salary from emps;`
    
*   `select sal*12 as annual_salary from emps;`
    
*   `select sal*12 as “Annual Salary” from emps;`
    
---

## Distinct

It is used to avoid duplicate values from the resultant table

*   **Rules:**
    
    *   Either \* or distinct must be the first argument in select clause
        
    *   We can use multiple columns along with distinct keyword, it will avoid combination of duplicate values
        
*   **Wqtd different job roles present in emps table**
    
    SQL
    
        Select distinct job from emps;
    
*   **Wqtd unique mgr from emp table**
    
    SQL
    
        select distinct mgr from emps; 
    
*   **Wqtd unique combination of salary an mgr**
    
    SQL
    
        select distinct sal, mgr from emps; 
    
---

## Selection

It is used to retrieve the from a table by selecting a column\_name/ Expression and providing some condition

*   **Syntax:**
    
    SQL
    
        Select column name/expression
        From the table
        Where condition; 
    
*   **Where:**
    
    *   To filter the records from a table
        
    *   **Characteristics of where clause**
        
        *   It executes after from clause
            
        *   It executes row by row
            
        *   It evaluates true or false conditions
            
        *   We can write multiple condition inside where clause
            
        *   We can’t use alias name inside where clause
            
*   **Order of execution**
    
    1.  FROM
        
    2.  WHERE
        
    3.  SELECT
        
*   **Wqtd details of emps if emp fname is kiran**
    
    SQL
    
        select *from emps
        where fname="kiran";
    
*   **WQTD fname as first name, lname as last name and job from emps table if the emp is working as waiter**
    
    SQL
    
        select fname 'first name' ,lname 'last name',job
        from emps
        where job='waiter';
    
*   **WQTD details of the emps who are getting sal more than 45000**
    
    SQL
    
        Select * from emps where sal>45000; 
    
*   **WQTD fname, lname , sal as salary and dob if emp born after the year 1993**
    
    SQL
    
        select fname, lname, sal, dob from emps where dob>='1994-01-01' or where dob >’1993-12-31’; 
    
*   **WQTD fname, job, doj if emp hired before the year 2019**
    
    SQL
    
        select fname, job, doj from emps where doj < '2019-12-31' ; 
    
*   **WQTD details of the Emps along with annual salary if emp is getting annual salary more than 500000**
    
    SQL
    
        select *, sal *12 as 'annual salary'
        from emps
        where sal*12 >500000; 
    
---

## Operators

*   Arithmetic operators (+, -, \*, /, %)
    
*   Relational operators (<, >, <=, >=, =, ! =)
    
*   Logical operators (AND, OR, NOT)
    
*   Special operators (IN, NOT IN, IS, BETWEEN, LIKE, NOT LIKE)
    
*   Subquery operators (ALL, ANY)
    

### Logical Operators

*   **OR:** It returns true if any one input is true
    
*   **AND:** It returns true if any all the inputs is true
    
*   **WQTD details of emps if emps are working as chef or cashier**
    
    SQL
    
        select * from emps where job = "chef" OR job= "cashier"; 
    
*   **WQTD fname, lname, sal, dob from emps table if employee born in year 1995**
    
    SQL
    
        select fname, lname, sal, dob
        from emps
        where dob >= '1995-01-01' and dob<='1995-12-31';
    
*   **WQTD fname,job and salary if the emps are working as waiter and getting salary more than 50000**
    
    SQL
    
        select fname, job, sal
        from emps
        where job="waiter” and sal>50000; 
    
*   **WQTD details of the emps if the emps are working as security or manager and their status is available**
    
    SQL
    
        select *
        from emps
        where (job="security" or job="manager") and status="available"; 
    
---

## IN

It is a multi value operator which takes multiple values at the rhs and dingle value at lhs

SQL

    COLUMN_NAME/EXPRESSION IN(V1,V2,....VN);

In operator works on “or” condition

*   **WQTD details of the employees who are working as security, chef, delivery or waiter and getting salary more than 45000**
    
    SQL
    
        select *
        from emps
        where (job="security" or job="chef" or job = "delivery” or job="waiter") and sal >45000; 
    
*   **OR**
    
    SQL
    
        Select * from emps
        Where job in (‘security’, ’chef’, ’delivery’, ’waiter’) and sal>45000; 
    
---

## NOT IN

It is a multi value operator which takes multiple values at the rhs single value at the lhs It works on “AND” condition

SQL

    COLUMN_NAME/EXPRESSION NOT IN(V1,V2,....VN);

Whenever we need to avoid comparison between multiple values based on AND operation

*   **WQTD name of Employee if employee is not getting salary as 100,200,300,400**
    
    SQL
    
        select fname
        from emps
        where sal not in(100,200,300,400); 
    
*   **WQTD fname, lname, sal, job if the emps are not working as chef, manager, waiter (without special character)**
    
    SQL
    
        select fname,lname,sal,job
        from emps
        where job not in('chef','manager',waiter');
    
---

## BETWEEN

Whenever we need to include some range of values we use BETWEEN operator

SQL

    COLUMN_NAME/EXPRESSION BETWEEN LOWER_RANGE_VALUE AND HIGHER_RANGE_VALUE;

*   **WQTD details of employees if the employees are getting salary more than or equals to 35000 or less than or equals to 50000**
    
    SQL
    
        select *
        from emps
        where sal between 35000 and 50000;
    
*   **WQTD details of employees those who are born in the year 1995**
    
    SQL
    
        select *
        from emps
        where dob between '1995-01-01' and '1995-12-31'; 
    
---

## NOT BETWEEN

Whenever we need to exclude some range of values, we us NOT BETWEEN

SQL

    COLUMN_NAME/EXPRESSION NOT BETWEEN LOWER_RANGE_VALUE AND HIGHER_RANGE_VALUE;

*   **WQTD details of the employees those who are not getting salary in the range of 35000 to 45000**
    
    SQL
    
        select *
        from emps
        where sal not between 35000 and 45000;
    
*   **WQTD details of emps those who are not joined in the year 2019**
    
    SQL
    
        select * from emps
        where doj not between '2019-01-01' and '2019-12-31'; 
  
  ---

## IS

It is used to check whether the column is null or not null

*   **Syntax:** `Column_name / expression is null/not null;`
    
*   **WQTD details of the employees who are getting some commission**
    
    SQL
    
        select *
        from emps
        where sal is not null; 
    
*   **WQTD details of the emps wo are acting as customer for their company**
    
    SQL
    
        select *
        from emps
        where cid is not null; 
---

## LIKE

It is used for pattern matching

*   **Syntax:** `Column_name/Expression Like ‘pattern_to_match’;`
    
*   **%:** It takes any character n number of time
    
*   **\_ :** It takes any character but only one time
    
*   **WQTD details of the emps if employee fname is starting with k.**
    
    SQL
    
        select * from emps
        where fname like 'k%'; 
    
*   **WQTD fname, lname if employee fname is ending with i**
    
    SQL
    
        select fname, lname from emps
        where fname like '%i'; 
    
*   **WQTD fname, lname and sal if employee fname contains atleast 2a and salary more than 25000**
    
    SQL
    
        select fname, lname, sal from emps
        where fname like '%a%a%' and sal>25000;
    
*   **WQTD details of the emps if job is starting with sec**
    
    SQL
    
        select * from emps
        where job like 'sec%'; 
    
*   **WQTD details of the emps if fname starts with s or a**
    
    SQL
    
        select * from emps
        where fname like 's%' or fname like 'a%'; 
    
*   **WQTD details of the emps if fname starts with vowels**
    
    SQL
    
        select * from emps
        where fname like 'a%' or fname like 'e%'or fname like 'i%' or fname like 'o%'or fname like 'u%';
    
*   **WQTD details of emps if the emps hired in the year 2019**
    
    SQL
    
        select *
        from emps
        where doj like '2019%'; 
    
*   **WQTD fname, lname, dob if emps were born in the month of jan, feb or march**
    
    SQL
    
        select fname,lname,dob
        from emps
        where dob like '%-01-%’ or dob like '%-02-%' or dob like '%-03-%'; 
    
*   **WQTD details of emps who were hired in the date of 12 or 01**
    
    SQL
    
        select *
        from emps
        where doj like '%12' or doj like '%01'; 

  ---

## NOT LIKE

It is also used for pattern matching Here, it will exclude the details based on the pattern

*   **Syntax:** `column_name/ expression not like ‘pattern_to_match’;`
    
*   **WQTD fname from emp table if the emp fname is not starting with s**
    
    SQL
    
        select fname
        from emps
        where fname not like 's%'; 
    
*   **WQTD details of emps if the emps were not born during the year 1995**
    
    SQL
    
        select *
        from emps
        where dob not like '1995%'; 
    
*   **WQTD details of emps whose fname is not starting with m and k**
    
    SQL
    
        select *
        from emps
        where fname not like 'm%' and fname not like 'k%'; 
    
*   **WQTD fname, lname if emp name is starting wit vowels and lname is not ending with vowels**
    
    SQL
    
        select fname, lname
        from emps
        where (fname like 'a%' or fname like 'e%' or fname like 'i%' or fname like 'o%' or fname like 'u%') and lname not like '%a' and lname not like '%e' and lname not like '%i' and lname not like '%o' and lname not like '%u'; 
    
*   **WQTD fname, lname if lname contains exactly 3 characters**
    
    SQL
    
        select fname, lname
        from emps
        where lname like '___'; 
    
*   **WQTD details of emps if the emp fname last 3rd character is e and lname last character is r and working as waiter or manager but not as female.**
    
    SQL
    
        select *
        from emps
        where fname like '%e__' and lname like '%r' and job in ('waiter', 'manager') and gender! ='F'; 
    
*   **WQTD details of emps from pentagon table if name consists at least 1% in it**
    
    +------+-----------+
        | id   | name      |
        +------+-----------+
        |    1 | rak%shith |
        |    2 | su_hail   |
        |    3 | sa%ndh%ya |
        +------+-----------+
    
    Using this table the output should be rakshith and sandhya because it contains percentage symbol
    
    SQL
    
        select *
        from pentagon
        where name like '%\%%'; 
    
*   **Note:** `\` : To remove special behaviour from special character we need to use use backslash(/) in front of the special character.
    
*   **Wqtd name of emps from pentagon table if name contains atleast 2%**
    
    SQL
    
        select name from pentagon
        where name like '%\%%\%%'; 
    
*   **Wqtd name of emps from pentagon table if name 3rd character is \_**
    
    SQL
    
        select name from pentagon
        where name like '__\_%'; 
  ---
  

## FUNCTION

It is a set of instructions/ block od codes to perform some specific task

*   **Function**
    
    *   User defined Function
        
        *   Procedure
            
        *   Trigger
            
    *   Pre defined Function
        
        *   Aggregate Function
            
        *   Character Function
            
        *   Number Function
            
        *   Date Function
---        

## Aggregate Function/ group Function/ multi-row function

### Types of Aggregate Function

*   **Max ()**
    
    *   It is used to obtain maximum value from given column
        
    *   **Syntax:** `select max(column_name) from table_name;`
        
    *   **Example:**
        
        SQL
        
            select max(sal)
            from emps;
*   **Min ()**
    
    *   It is used to obtain minimum value from given column
        
    *   **Syntax:** `min(column_name/Expression)`
        
    *   **Example:**
        
        SQL
        
            select min(sal)
            from emps; 
        
*   **Avg ()**
    
    *   It is used to obtain average value from the given column
        
    *   **Syntax:** `avg(column_name/Expression)`
        
    *   **Example:**
        
        SQL
        
            select avg(sal)
            from emps;
        
*   **Sum ()**
    
    *   It is used to obtain total value from the given column
        
    *   **Syntax:** `sum(column_name/Expression)`
        
    *   **Example:**
        
        SQL
        
            select sum(sal)
            from emps; 
        
*   **Count ()**
    
    *   It is used to obtain number of values present in given column
        
    *   **Syntax:** `count(*/column_name/Expression)`
        
    *   **Example:**
        
        SQL
        
            select count (*)
            from emps;
        
    *   **Note:** Only for Count () we can use \* as an argument
        

### Characteristics of Aggregate Functions

*   It takes n number of inputs but generates single output
    
*   It executes Group by Group
    
*   We can’t use normal columns along with aggregate function inside select clause.
    
*   We can use only one column as a argument for aggregate function.
    
*   We can’t nest aggregate functions.
    
*   It ignores null values.
    
*   We can’t use aggregate function in where clause
    
*   We can use group by expression along with aggregate function inside select clause
    
*   **WQTD Total salary given to the employees who are working as delivery**
    
    SQL
    
        select sum(sal)
        from emps
        where job='delivery'; 
    
*   **WQTD average salary, total salary, minimum salary and maximum salary given to the employees whose fname starts with k or a**
    
    SQL
    
        select avg(sal), sum(sal), min (sal), max(sal)
        from emps
        where fname like 'k%' or fname like 'a%'; 
    
*   **WQTD number of emps working as delivery or manager**
    
    SQL
    
        select count (*)
        from emps
        where job="delivery" or job="manager"; 
    
    *   **Or**
        
    
    SQL
    
        where job in (‘delivery’, ‘manager’);
*   **WQTD number of unique job roles from emps table**
    
    SQL
    
        select count (distinct job)
        from emps; 
    
*   **WQTD number of employees getting salary more than 50000 and born during the date 12 and not getting commission**
    
    SQL
    
        select count (*)
        from emps
        where sal>50000 and dob like '%12' and comm is null; 

---

## Group by:

It is used to create groups

### Characteristics of group by clause

*   It executes row by row
    
*   It executes after from clause (if there is no where clause)
    
*   With or without using where clause we can use group by clause
    
*   It executes row by row after execution it will create group only
    
*   We can use multiple columns along with group by clause, it will create the groups based on combination
    
*   Any clause which executes after group by clause will execute group by group only.
    
*   **Group by Expression**
    
    *   The columns which are passing inside group by clause will be considered as group by expression
        

#### Order of Execution

1.  From
    
2.  \[where\]
    
3.  Group by
    
4.  Select
    

*   **WQTD number of emps working in each job role**
    
    SQL
    
        select job, count(*)
        from emps
        group by job; 
    
*   **wqtd number of employees per status**
    
    SQL
    
        select status, count(*)
        from emps
        group by status; 
    
*   **wqtd total salary spent by the company in each job if job roles are delivery, manger or waiter**
    
    SQL
    
        select sum(sal),job
        from emps
        where job in('delivery','manager','waiter')
        group by job; 
    
*   **Wqtd number of emps working in each location and getting salary more than 32000 and less than 50000**
    
    SQL
    
        select count(sal),lid
        from emps
        where sal>32000 and sal<50000
        group by lid; 
    
---

## HAVING

It is used to filter the group function

### Characteristics of Having clause

*   It executes group by group
    
*   It executes after group by clause
    
*   It evaluates true or false condition
    
*   We can pass multiple condition inside having clause
    
*   We can’t use normal columns inside having clause
    

### Order of execution

1.  From
    
2.  \[where\]
    
3.  Group by
    
4.  Having
    
5.  Select
    

*   **Wqtd maximum salary of emps per lid if the emp is getting salary more than 25000 and maximum salary more than 50000**
    
    SQL
    
        select max(sal),lid
        from emps
        where sal>25000
        group by lid
        having max(sal)>50000; 
    
*   **wqtd average salary and total salary obtained in each location if the average salary of the location is more than 40000**
    
    SQL
    
        select avg(sal),sum(sal),lid
        from emps
        group by lid
        having avg(sal)>40000; 
    
*   **Wqtd total salary and number of emps working in each job if more than 2 emps working in each job role**
    
    SQL
    
        select sum(sal),count(*),job
        from emps
        group by job
        having count(*)>2; 
    
*   **Wqtd maximum salary and minimum salary and number of emps working in each location if the location contains atleast 2 emps working in it and employee salary must be more than 320000**
    
    SQL
    
        select max(sal),min(sal),count(*),lid
        from emps
        where sal>32000
        group by lid
        having count(*)>=2; 
    
*   **Wqtd number of emps who are getting same salary /repeated salary**
    
    SQL
    
        select count(*),sal
        from emps
        group by sal
        having count(*)>1;
    
*   **Wqtd number of emps having same gender and working in same job**
    
    SQL
    
        select count(*)
        from emps
        group by job,gender
        having count(*) >1; 
    
---

### Difference between where and having clause

| Aspect | WHERE Clause | HAVING Clause |
| --- | --- | --- |
| Usage | Filters rows before grouping | Filters groups after grouping |
| Used With | SELECT, UPDATE, DELETE | SELECT (with GROUP BY) |
| Aggregation | Cannot use aggregate functions (like SUM, AVG) | Can use aggregate functions |
| Performance | Generally faster, as it filters early | Slower if large groups are created |
| Example | SELECT * FROM sales WHERE region = 'East'; | SELECT region, SUM(sales) FROM sales GROUP BY region HAVING SUM(sales) > 1000; |
|  |  |  |

----

## Order by

It is used to arrange records either in ascending order or descending order

*   **Syntax:**
    
    SQL
    
        Select column_name/expression
        From table_name
        Order by column_name asc/desc; 

### Characteristics of order by

*   It is a last executable clause in a query
    
*   It executes after select clause
    
*   By default it will consider ascending order for columns
    
*   Normally in all the table records are arranged in ascending order based on primary key column
    
*   We can use alias name inside order by clause
    
*   We can use multiple columns inside order by clause, it will give the priority for first column order if the values are same for te first column order then it will give the priority for 2nd column order
    

### Order of Execution

1.  From
    
2.  \[Where\]
    
3.  Group by
    
4.  Having
    
5.  Select
    
6.  Order by
    

*   **Wqtd details of emps based on their salary maximum to minimum order**
    
    SQL
    
        select *
        from emps
        order by sal desc; 
    
*   **Wqtd fname,lname and job if the emps are working as security or manager or cleaner and arrange the records according to alphabetical order of their fname**
    
    SQL
    
        select fname,lname,job
        from emps
        where job='security' or job='manager' or job='cleaner'
        order by fname asc; 
    
*   **Wqtd number of emps who are having same gender and working in same job role and emps are getting salary more than 30000 and arrange the job in alphabetical order**
    
    SQL
    
        select count(*),gender,job
        from emps
        group by gender,job
        having count(*)>1
        order by job asc; 
    
---

## Limit

It is used to display specific number of records from resultant table

*   **Syntax:**
    
    SQL
    
        Select column_name/Expression
        From table_name
        Limit value; 
    
*   **Wqtd details of first 3 records from emps table**
    
    SQL
    
        select *
        from emps
        limit 3; 
    
*   **Wqtd details of first record from emps table**
    
    SQL
    
        select *
        from emps
        limit 1; 

---

## Offset

It is used to skip/ignore specific number of records from resultant table

*   **Syntax:**
    
    SQL
    
        Select column_name /expression
        from table-name
        Limit value offset value;
    
*   **Wqtd details of 2nd record from emps table**
    
    SQL
    
        select *
        from emps
        limit 1 offset 1; 
    
*   **Wqtd details of 5th and 6th record from the emps table**
    
    SQL
    
        select *
        from emps
        limit 2 offset 4; 
    
*   **Wqtd details of top 5 maximum salary holders**
    
    SQL
    
        select *
        from emps
        order by sal desc
        limit 5; 
    
*   **Wqtd last 3 records details from emps table**
    
    SQL
    
        select *
        from emps
        order by eid desc
        limit 3; 
    
*   **Wqdt 2nd maximum salary from emps table**
    
    SQL
    
        select distinct sal
        from emps
        order by sal desc
        limit 1 offset 1; 
    
*   **Wqtd 4th minimum salary from emps table**
    
    SQL
    
        select distinct sal
        from emps
        order by sal asc
        limit 1 offset 3; 
    
---

## Character function

### Characteristics of character function

*   It takes n number of inputs and generates n number of outputs
    
*   It executes row by row
    
*   We can nest character functions
    
*   We can use character functions inside where clause
    

### Types of Character functions

*   **Lower ():**
    
    *   It is used to convert given string value into lower case
        
    *   **Example:** `Select lower(‘INDIA’);` -> `india`
        
*   **Upper () :**
    
    *   It is used to convert given string value into upper case
        
    *   **Example:** `Select upper(‘india’);` -> `INDIA`
        
*   **Length ():**
    
    *   It is used to obtain total number of characters present in given string
        
    *   **Example:** `Select length(‘pentagon space’);` -> `14`
        
*   **Wqtd 2nd longest city as well as their respective length from locations table if there is more than 1 2nd longest city choose the one that comes first when we ordered alphabetically**
    
    *   **Sample i/p:**
        
        *   City:
            
        *   Abc
            
        *   Pqrs
            
        *   Abcd
            
        *   Pqr
            
        *   Abcde
            
    *   **o/p:**
        
        *   Abcd 4
            
    
    SQL
    
        select city,length(city)
        from locations
        order by length(city) desc, city asc
        limit 1 offset 1 [cite: 901, 902, 903, 904]
    
*   **Reverse ():**
    
    *   It is used to display given string in reverse format
        
    *   **Example:** `Select reverse (‘pentagon’);` -> `nogatenep`
        
*   **Concat ():**
    
    *   It is used to add/combine two or more string values
        
    *   **Syntax:** `Concat (‘str_1’, ’str_2’);`
        
    *   **Example:**
        
        SQL
        
            select concat('Mr/Miss ',fname,' your salary is ',sal,' rs.')
            from emps; [cite: 914, 915]
        
*   **Wqtd fname and lname as full name from emps table**
    
    SQL
    
        select concat (fname,' ',lname)
        from emps; [cite: 917, 918]
    


*   **substr ():**
    
    *   It is used to extract some part of the string in original string
        
    *   **Syntax:** `substr (‘original string’, position, [length]);` length is optional
        
    *   **Case 1:**
        
        *   **Note:** in sql index value starts from 1
            
        *   **Example:**
            
            *   `Select substr( ‘ BENGALURU’,7,2);` -> `UR`
                
            *   `Select substr(‘BENGALURU’,5);` -> `ALURU`
                
    *   **Case 2:**
        
        *   We also have negative index value in SQL, it starts from right to left
            
        *   **Example:**
            
            *   `Select substr (‘BENGALURU’, -4,4);` -> `LURU`
                
            *   `Select substr (‘BENGALURU’, -7);` -> `NGALURU`
                
*   **Wqtd details of emps if employee fname is starting with ‘a’**
    
    SQL
    
        select *
        from emps
        where substr(fname,1,1)='a'; 
    
*   **Wqtd details of emps if employee lname is ending with ‘i’**
    
    SQL
    
        select *
        from emps
        where substr(lname,-1,1)='i'; 
    
*   **Wqtd fname and job if employee job is starting with sec or man**
    
    SQL
    
        select fname,job
        from emps
        where substr(job,1,3)='sec' or substr(job,1,3)='man'; 
    
    *   **or**
        
    
    SQL
    
        select fname,job
        from emps
        where substr(job,1,3)in('sec','man'); 
    
*   **Wqtd fname and lname if fname is not starting with vowels**
    
    SQL
    
        select fname,job
        from emps
        where substr(fname,1,1) not in('a','e','i','o','u'); 
    
*   **Wqtd details of employee who are born in the year 1995**
    
    SQL
    
        select *
        from emps
        where substr(dob,1,4)='1995'; 
    
*   **Wqtd fname,lname,doj if employee joined in the month of April, may, June or July**
    
    SQL
    
        select fname,lname,doj
        from emps
        where substr(doj,6,2)in(04,05,06,07); 
    
*   **Wqtd details of employees whose reversed is matching with string ‘nama’**
    
    SQL
    
        select *
        from emps
        where reverse(fname)='nama'; 
    
*   **Wqtd extract initials from full name in below format**
    
    *   Fname: puneeth
        
    *   Lname:rajkumar
        
    *   Full name: puneeth rajkumar
        
    *   o/p: p.r.
        
    
    SQL
    
        select concat(substr(fname,1,1),'.',substr(lname,1,1),'.') as initials
        from emps;
    
*   **Wqtd fname, lname and job together in below format**
    
    *   Fname: Sharukh
        
    *   Lname: khan
        
    *   o/p: Sharukh khan(actor)
        
    
    SQL
    
        select concat(fname,' ',lname,' ','(',job,')')
        from emps;
    
*   **Wqtd first half of fname from emps table**
    
    SQL
    
        select substr(fname,1,length(fname)/2)
        from emps; 
    
*   **Wqtd second half of fname from emps table**
    
    SQL
    
        select substr(fname,length(fname)/2+1)
        from emps; 
    
*   **wqtd first half of fname in lowercase and second half of fname in reverse format**
    
    *   samp o/p:
        
    *   Sameer: samree
        
    
    SQL
    
        select concat(lower(substr(fname,1,length(fname)/2)),reverse(substr(fname,length(fname)/2+1))) as name from emps; 
    
*   **Wqtd fname ans password for emps,password must conatin below conditions**
    
    1.  First 3 characters of fname
        
    2.  Length of fname
        
    3.  Last 3 digits of their job role
        
    
    *   samp i/p:
        
    *   Fname: Shakila
        
    *   Job: waiter
        
    *   Samp o/p:
        
    *   Fname: Shakila
        
    *   Password:sha7ter
        
    
    SQL
    
        select fname,concat(substr(fname,1,3),length(fname),substr(job,-3)) as password
        from emps;
    
*   **REPLACE**
    
    *   It is used to replace substring from new string in original string
        
    *   **Syntax:** `replace(‘original string’, ‘sub string’, new string’);`
        
    *   **Example:**
        
        *   `Select replace(‘pentagon’,’pent’,’hex’);` -> `hexagon`
            
        *   `select replace('pentyy','n','') as replaces;` -> `petyy`
            
*   **wqtd replace a and I with \[a\] and \[i\] in kiran ??**
    
    *   o/p: k\[i\]r\[a\]n
        
    
    SQL
    
        select replace(replace('kiran','a','[a]'),'i','[i]'); 
    
*   **wqtd count of character a in Malayalam**
    
    SQL
    
        select length('malayalam')- length(replace('malayalam','a',''));
    
*   **wqtd details of emps if name contains exactly 1**
    
    SQL
    
        select * from emps
        where length(fname) - length(replace(fname,'A','')) = 1; 
 ---   

## Number Functions

### Characteristics of Number Functions

*   It takes n number of inputs and generates n number of outputs
    
*   It executes row by row
    
*   We can nest number functions
    
*   We can use number functions inside where clause
    

### Types of Number Functions

*   **Abs ():**
    
    *   It is used to convert a negative number to positive number
        
    *   **Example:**
        
        *   `Select abs (-18);` -> `18`
            
        *   `Select abs (18);` -> `18`
            
*   **Mod ():**
    
    *   It is used to obtain remainder value
        
    *   **Syntax:** `Mod (m,d);`
        
    *   **Example:** `Mod (8,2);` -> `0`
        
*   **Wqtd details of emps if emps are having even eid**
    
    SQL
    
        select *
        from emps
        where mod(eid,2)=0; [cite: 1035, 1036, 1037]
    
*   **Round():**
    
    *   It is used to round off a number upto specified number of decimal places
        
    *   **Syntax:** `Round(number, decimal_places)`
        
    *   **Example:**
        
        *   `Select round (123.4);` -> `123`
            
        *   `Select round (123.5);` -> `124`
            
        *   `Select round (123.456,2);` -> `123.46`
            
        *   `Select round(123.45645,3);` -> `123.456`
            
*   **Wqtd average salary obtained in each job and round off the average salary upto 2nd decimal place**
    
    SQL
    
        select round(avg(sal),2), job
        from emps
        group by job; [cite: 1048, 1049, 1050]
    
*   **Ceil ():**
    
    *   It will obtain next integer value from the given decimal value (if it is a positive number)
        
    *   It will obtain current integer value from the given decimal value ( if it is a negative number)
        
    *   **Example:**
        
        *   `select ceil(4.5);` -> `5`
            
        *   `select ceil(-4.5);` -> `-4`
            
*   **Floor() :**
    
    *   It will obtain current integer value from the given decimal value (if it is a positive number)
        
    *   It will obtain next integer value from the given decimal value ( if it is a negative number)
        
    *   **Example:**
        
        *   `select floor (5.1);` -> `5`
            
        *   `select floor (-5.1);` -> `-6`
            
*   **Truncate():**
    
    *   It is used to cut off a number upto specified number of decimal places witout rounding it.
        
    *   **Syntax:** `Truncate(number, decimal_place);`
        
    *   **Example:**
        
        *   `select truncate(123.4567,2);` -> `123.45`
            
        *   `select truncate(123.456733,4);` -> `123.4567`
            
        *   `select truncate(123.456733);`
            
        *   `ERROR 1064 (42000): You have an error in your SQL syntax;`
            
*   **Pow():**
    
    *   It is used to obtain power value of a number
        
    *   **Example:**
        
        *   `select pow(8,2);` -> `64`
            
        *   `select pow(2,3);` -> `8`
            
*   **Sqrt():**
    
    *   It is used to obtain root value of a non negative number
        
    *   **Example:**
        
        *   `select sqrt(4);` -> `2`
            
        *   `select sqrt(-4);` -> `NULL`
            

* * *
---

## Date Functions

### Characteristics of Number Functions

*   It takes n number of inputs and generates n number of outputs
    
*   It executes row by row
    
*   We can nest date functions
    
*   We can use date functions inside where clause
    

### Types of Date Functions

*   **Curdate()**
    
    *   It is used to obtain current date from the system
        
    *   **Example:** `select curdate ();` -> `2025-07-09`
        
*   **Sysdate () / now():**
    
    *   It is used to obtain current date and time from the system
        
    *   **Example:**
        
        *   `select sysdate();`
            
        *   `select now();` -> `2025-08-05 17:38:30`
            
*   **Year ():**
    
    *   It is used to extract year from given date expression
        
    *   **Example:**
        
        *   `select year('2024-10-12');` -> `2024`
            
        
        SQL
        
            select year(dob)
            from emps; [cite: 1103, 1104]
        
*   **Month():**
    
    *   It is used to extract month from given date expression
        
    *   **Example:**
        
        *   `select month('2024-10-12');` -> `10`
            
        
        SQL
        
            select month(dob)
            from emps; 
        
*   **Day():**
    
    *   It is used to extract day from given date expression
        
    *   **Example:**
        
        *   `select day('2024-10-12');` -> `12`
            
        
        SQL
        
            select day(dob)
            from emps; 
        
*   **Wqtd details of the emps if the emps before the year 1995**
    
    SQL
    
        select *
        from emps
        where year(dob)<1995; 
    
*   **Wqtd details of emps if the employees ired in the month of April, janor feb**
    
    SQL
    
        select *
        from emps
        where month(doj) in (4,1,2);
    
*   **Wqtd details of emps if employees hired in leap year**
    
    SQL
    
        select *
        from emps
        where mod(year(doj),4)=0; 
    

*   **Datediff ():**
    
    *   It is used to obtain day difference between two values
        
    *   **Example:**
        
        SQL
        
            select datediff('2025-07-10','2025-07-09');
        +-------------------------------------+
            | datediff('2025-07-10','2025-07-09') |
            +-------------------------------------+
            |                                   1 |
            +-------------------------------------+
        
*   **Date\_add ():**
    
    *   It is used to add some time interval for given datae value
        
    *   **Syntax:** `date_add (‘date value’, interval value unit);`
        
    *   **Interval:** It is a keyword used to add/subtract some time interval
        
    *   **Value:** The amount of time which we are adding
        
    *   **Unit:** unit of time interval( ex: year, month, day)
        
*   **Wqtd add 3 year for below date**
    
    *   2020-10-11
        
    
    SQL
    
        select date_add ('2020-10-11', interval 3 year); 
    
*   **Wqtd add 5 year 6 months for below date**
    
    *   ‘2001-12-10’
        
    
    SQL
    
        select date_add('2001-12-10',interval 66 month); 
    
    *   **or**
        
    
    SQL
    
        select date_add(date_add('2001-12-10',interval 5 year), interval 6 month); 
    
*   **Date\_sub:**
    
    *   It is used to subtract some time interval from given date value
        
    *   **Syntax:** `Date_sub(‘date value’, interval value unit);`
        
*   **Wqtd subtract 3 year 10 months and 15 days from below date**
    
    SQL
    
        select date_sub(date_sub(date_sub('2025-01-24',interval 3 year),interval 10 month), interval 15 day); 
    
*   **Date\_format() :**
    
    *   It is used to extract individual characters from given date-time expression
        
    *   **Syntax:** `Date_Format (‘date value’, ‘date_Format_pattern’);`
        
*   **Wqtd current date and time in below format**
    
    *   ’25-July-11 05 pm Friday’
        
    
    SQL
    
        select date_format(now(),'%y-%M-%d %h %p %W'); 
    
*   **wqtd fname and dob in us date format**
    
    *   us date format: MM-dd-yyyy
        
    
    SQL
    
        select fname,date_format(dob,'%m-%d-%Y')
        from emps; [cite: 1170, 1171]
    
*   **Wqtd details of the emps were hired on Friday, Saturday or Sunday**
    
    SQL
    
        select *
        from emps
        where date_format(doj,'%W') in ('friday','saturday','sunday'); 
    
    *   **Or**
        
    
    SQL
    
        select *
        from emps
        where date_format(doj,'%a') in ('fri','sat','sun'); 
    
*   **Wqtd fname and current experience of all the emps in terms of year**
    
    SQL
    
        SELECT FNAME,DATE_FORMAT(CURDATE(), '%Y')-DATE_FORMAT(DOJ, '%Y') EXP
        FROM EMPS;
    
*   **Wqtd number of emps hired in each month and display the numbers maximum to minimum order based on their count**
    
    SQL
    
        select count(*), month(doj)
        from emps
        group by month(doj)
        order by count(*) desc;
    
*   **Wqtd last hired employee doj**
    
    SQL
    
        select max(doj)
        from emps;
    
    *   **Or**
        
    
    SQL
    
        select doj
        from emps
        order by doj desc
        limit 1; 
    
*   **Wqtd add 2 year for first hired employee doj**
    
    SQL
    
        select date_Add(min(doj),interval 2 year)
        from emps; 
