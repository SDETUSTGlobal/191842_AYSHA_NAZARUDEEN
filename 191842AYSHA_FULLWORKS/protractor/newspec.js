describe('Smartbear Website', function() {
  it('should verify title', function() {
    browser.get('http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx');

    expect(browser.getTitle()).toEqual('Web Orders');
  });
});