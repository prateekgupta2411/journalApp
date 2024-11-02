package com.prateek.journalApp.service;

import com.prateek.journalApp.Repository.JournalEntryRepository;
import com.prateek.journalApp.entity.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryService {
    // business logic

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);
    }
}
// controller --> service --> repository
