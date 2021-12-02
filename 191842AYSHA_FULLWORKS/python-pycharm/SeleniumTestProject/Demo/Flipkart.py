
import time
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
print("test case started")
driver = webdriver.Chrome("D:\\chromedriver_win32\\chromedriver.exe")
driver.maximize_window()
driver.get("https://www.flipkart.com/")
driver.find_element_by_xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input").send_keys("Boots")

time.sleep(3)
#close the browser
driver.close()
print("sample test case successfully completed")