from behave import *
from selenium import webdriver
import time


@when('user on home page.')
def home(context):
    context.driver = webdriver.Chrome(executable_path="D:\chromedriver_win32\chromedriver.exe")
    context.driver.get("https://www.myntra.com/")
    time.sleep(2)


@when('user enters top on search bar')
def enters(context):
    context.driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input").send_keys("Maybelline")
    time.sleep(2)


@when('user clicks "search" button')
def clicks(context):
    context.driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/a/span").click()
    time.sleep(2)


@then('user enters new site')
def new(context):
    context.driver.get("https://www.myntra.com/foundation-and-primer/maybelline/maybelline-fit-me-set-of-concealer--matte-foundation/15060308/buy")





@then('user clicks add to bag')
def clicks(context):
    context.driver.find_element_by_xpath("/html/body/div[2]/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]").click()


@when('user has navigates to add to bag')
def navigates(context):
    context.driver.find_element_by_xpath("/html/body/div[2]/div/div/div/main/div[2]/div[2]/div[3]/div/a").click()
    time.sleep(2)



@when('close browser')
def close(context):
    context.driver.close()
