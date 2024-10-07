package org.example.jpa.service;

import org.example.jpa.model.Feedback;

import java.util.List;
import java.util.Optional;

public interface FeedbackServiceInterface {
    public abstract Feedback save(Feedback feedback);   //save feedback
    public abstract List<Feedback> findAll();   //find all feedback
    public abstract Optional<Feedback> findById(Long id);    //find by id
    public abstract Feedback update(Feedback feedback);      //update feedback
    public abstract void deleteById(Long id);
    public abstract void deleteAll(Long id);
    public abstract long count(); //count all feedbacks


}
