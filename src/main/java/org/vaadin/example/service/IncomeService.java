package org.vaadin.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaadin.example.model.Income;
import org.vaadin.example.repository.IncomeRepository;

import java.util.List;

@Service
public class IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    public List<Income> getIncomesByUserId(Long userId) {
        return incomeRepository.findByUserId(userId);
    }

    public Income addIncome(Income income) {
        return incomeRepository.save(income);
    }

    public Income findIncomeById(Long id) {
        return incomeRepository.findById(id).orElse(null);
    }

    public void deleteIncome(Long id) {
        incomeRepository.deleteById(id);
    }
}
