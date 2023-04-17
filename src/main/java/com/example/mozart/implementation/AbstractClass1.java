package com.example.mozart.implementation;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractClass1 {
  private ConcreteDependance1 dependance1;
  private ConcreteDependance2 dependance2;

}
