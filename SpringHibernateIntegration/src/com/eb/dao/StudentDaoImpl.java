package com.eb.dao;
import com.eb.beans.Student;
import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


public class StudentDaoImpl implements StudentDao{
 private HibernateTemplate hTemplate;
 public void sethTemplate(HibernateTemplate hTemplate) {
 this.hTemplate = hTemplate;
 }
 @Override
 @Transactional
 public int insert(Student s) {
 return (int) hTemplate.save(s);
 }
 @Override
 @Transactional
 public void delete(int id) {
 Student s=hTemplate.get(Student.class,id);
 hTemplate.delete(s);
 
 }
 @Override
 @Transactional
 public void delete(Student s) {
 hTemplate.delete(s);
 }
 @Override
 @Transactional
 public void update(Student s) {
 hTemplate.update(s);
 }
 @Override
 public Student getStudent(int id) {
 return hTemplate.get(Student.class,id);
 }
 @Override
 public List<Student> getAllStudents() {
 return hTemplate.loadAll(Student.class);
 }
}