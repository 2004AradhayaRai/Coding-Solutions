# Write your MySQL query statement below
Select st.student_id , st.student_name ,sb.subject_name , COUNT(e.subject_name) as attended_exams 
from Students st Cross Join Subjects sb Left Join Examinations e 
ON st.student_id = e.student_id AND e.subject_name = sb.subject_name
Group by st.student_id,st.student_name, sb.subject_name
Order by st.student_id,sb.subject_name