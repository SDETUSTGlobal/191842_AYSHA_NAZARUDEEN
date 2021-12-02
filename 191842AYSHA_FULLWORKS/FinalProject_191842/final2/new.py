from selenium import webdriver
import time
driver = webdriver.Chrome("C:/chromedriver.exe")
driver.maximize_window()
driver.delete_all_cookies()
driver.get("http://127.0.0.1:5000/")
time.sleep(2)
driver.find_element_by_id("NAME").send_keys("Aysha")
time.sleep(3)
driver.find_element_by_id("UID").send_keys("191842")
time.sleep(3)
driver.find_element_by_id("COMPANY").send_keys("UST")
time.sleep(3)
driver.find_element_by_id("EMAIL").send_keys("191842@ust-global.com")
time.sleep(3)

driver.find_element_by_xpath("/html/body/form/div/button").click()
time.sleep(5)
driver.close()

