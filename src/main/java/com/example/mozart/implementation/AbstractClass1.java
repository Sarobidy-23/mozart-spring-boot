package com.example.mozart.implementation;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public abstract class AbstractClass1 {
  private final ConcreteDependance1 dependance1;
  private final ConcreteDependance2 dependance2;

}
