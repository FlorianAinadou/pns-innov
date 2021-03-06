-- MySQL Script generated by MySQL Workbench
-- Wed Jun  3 12:51:23 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydietdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydietdb` ;

-- -----------------------------------------------------
-- Schema mydietdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydietdb` DEFAULT CHARACTER SET utf8 ;
USE `mydietdb` ;

-- -----------------------------------------------------
-- Table `mydietdb`.`aliment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydietdb`.`aliment` ;

CREATE TABLE IF NOT EXISTS `mydietdb`.`aliment` (
  `id` VARCHAR(255) NOT NULL,
  `kcal` INT NULL,
  `proteine` INT NULL,
  `glucide` INT NULL,
  `lipide` INT NULL,
  `name` VARCHAR(45) NULL,
  `idUser` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `idUser_idx` (`idUser` ASC) VISIBLE,
  CONSTRAINT `idUser`
    FOREIGN KEY (`idUser`)
    REFERENCES `mydietdb`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydietdb`.`aliment_line`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydietdb`.`aliment_line` ;

CREATE TABLE IF NOT EXISTS `mydietdb`.`aliment_line` (
  `idDaily` INT NOT NULL,
  `idAliment` VARCHAR(45) NOT NULL,
  `quantity` DECIMAL(10) NOT NULL,
  PRIMARY KEY (`idDaily`, `idAliment`),
  INDEX `alimentId_idx` (`idAliment` ASC) VISIBLE,
  CONSTRAINT `alimentId`
    FOREIGN KEY (`idAliment`)
    REFERENCES `mydietdb`.`aliment` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `dailyId`
    FOREIGN KEY (`idDaily`)
    REFERENCES `mydietdb`.`daily_report` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydietdb`.`daily_report`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydietdb`.`daily_report` ;

CREATE TABLE IF NOT EXISTS `mydietdb`.`daily_report` (
  `id` VARCHAR(45) GENERATED ALWAYS AS (),
  `date` DATETIME NOT NULL,
  `userId` VARCHAR(45) NOT NULL,
  `weight` INT NULL,
  PRIMARY KEY (`id`, `date`),
  CONSTRAINT `userId`
    FOREIGN KEY (`id`)
    REFERENCES `mydietdb`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydietdb`.`recommendation`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydietdb`.`recommendation` ;

CREATE TABLE IF NOT EXISTS `mydietdb`.`recommendation` (
  `comment` VARCHAR(500) NULL,
  `date` DATETIME NOT NULL,
  `id` VARCHAR(255) NOT NULL,
  `idCoach` VARCHAR(255) NOT NULL,
  `idUser` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  INDEX `idCoach_idx` (`idCoach` ASC) VISIBLE,
  INDEX `idUser_idx` (`idUser` ASC) VISIBLE,
  CONSTRAINT `idCoach`
    FOREIGN KEY (`idCoach`)
    REFERENCES `mydietdb`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idUser`
    FOREIGN KEY (`idUser`)
    REFERENCES `mydietdb`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydietdb`.`recommendation_line`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydietdb`.`recommendation_line` ;

CREATE TABLE IF NOT EXISTS `mydietdb`.`recommendation_line` (
  `idRecommendation` VARCHAR(255) NOT NULL,
  `idAliment` VARCHAR(255) NOT NULL,
  `quantity` INT NOT NULL,
  PRIMARY KEY (`idRecommendation`, `idAliment`),
  INDEX `idAliment_idx` (`idAliment` ASC) VISIBLE,
  CONSTRAINT `idAliment`
    FOREIGN KEY (`idAliment`)
    REFERENCES `mydietdb`.`aliment` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idRecommendation`
    FOREIGN KEY (`idRecommendation`)
    REFERENCES `mydietdb`.`recommendation` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydietdb`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydietdb`.`user` ;

CREATE TABLE IF NOT EXISTS `mydietdb`.`user` (
  `email` VARCHAR(255) NULL,
  `password` VARCHAR(32) NOT NULL,
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `userId` VARCHAR(45) GENERATED ALWAYS AS (),
  `height` INT NULL,
  `weight` INT NULL,
  `age` INT NULL,
  `idCoach` VARCHAR(45) NULL,
  PRIMARY KEY (`userId`),
  UNIQUE INDEX `userId_UNIQUE` (`userId` ASC) VISIBLE,
  INDEX `idCoach_idx` (`idCoach` ASC) VISIBLE,
  CONSTRAINT `idCoach`
    FOREIGN KEY (`idCoach`)
    REFERENCES `mydietdb`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
