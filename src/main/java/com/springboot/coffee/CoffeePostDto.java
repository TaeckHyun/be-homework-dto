package com.springboot.coffee;

import lombok.Getter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
public class CoffeePostDto {
    @NotBlank(message = "필수 입력입니다")
    private String korName;

    @NotBlank(message = "필수 입력입니다")
    @Pattern(regexp = "^[A-Za-z]+( [A-Za-z]+)*$",
             message = "영문 이름은 단어 사이에 한 칸 공백만 허용되며, 앞뒤에 공백이 없어야 합니다.")
    private String engName;

    @Min(value = 100, message = "가격은 100 이상이어야 합니다.")
    @Max(value = 50000, message = "가격은 50000 이하이어야 합니다.")
    private int price;
}
